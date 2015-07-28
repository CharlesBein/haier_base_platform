 package cn.gooday.service.common.util.watch;
 
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;

 
 /**
  * 性能监控工具类
 * @author 赵士杰
 * 
 */
@SuppressWarnings({"unchecked","rawtypes"})
 public class StopWatchUtil
 {
   public StopWatchUtil()
   {
     this.id = "";
   }
 
   public StopWatchUtil(String id)
   {
     this.id = id;
   }
 
   public void setKeepTaskList(boolean keepTaskList)
   {
     this.keepTasks = keepTaskList;
   }
 
   public void start()
     throws IllegalStateException
   {
     start("");
   }
 
   public void start(String taskName)
     throws IllegalStateException
   {
     if (this.running) {
       throw new IllegalStateException("Can't start StopWatch: it's already running");
     }
     this.startTimeMillis = System.currentTimeMillis();
     this.running = true;
     this.currentTaskName = taskName;
   }
 
   public void stop()
     throws IllegalStateException
   {
     if (!(this.running)) {
       throw new IllegalStateException("Can't stop StopWatch: it's not running");
     }
     long lastTime = System.currentTimeMillis() - this.startTimeMillis;
     this.totalTimeMillis += lastTime;
     this.lastTaskInfo = new TaskInfo(this.currentTaskName, lastTime);
     if (this.keepTasks) {
       this.tasks.add(this.lastTaskInfo);
     }
     this.taskCount += 1;
     this.running = false;
     this.currentTaskName = null;
   }
 
   public boolean isRunning()
   {
     return this.running;
   }
 
   public long getLastTaskTimeMillis()
     throws IllegalStateException
   {
     if (this.lastTaskInfo == null) {
       throw new IllegalStateException("No tasks run: can't get last task interval");
     }
     return this.lastTaskInfo.getTimeMillis();
   }
 
   public String getLastTaskName()
     throws IllegalStateException
   {
     if (this.lastTaskInfo == null) {
       throw new IllegalStateException("No tasks run: can't get last task name");
     }
     return this.lastTaskInfo.getTaskName();
   }
 
   public TaskInfo getLastTaskInfo()
     throws IllegalStateException
   {
     if (this.lastTaskInfo == null) {
       throw new IllegalStateException("No tasks run: can't get last task info");
     }
     return this.lastTaskInfo;
   }
 
   public long getTotalTimeMillis()
   {
     return this.totalTimeMillis;
   }
 
   public double getTotalTimeSeconds()
   {
     return (this.totalTimeMillis / 1000.0D);
   }
 
   public int getTaskCount()
   {
     return this.taskCount;
   }
 
   /**
    * 获取所有任务信息
	 * @return
	 */
   public TaskInfo[] getTaskInfo()
   {
     if (!(this.keepTasks)) {
       throw new UnsupportedOperationException("Task info is not being kept!");
     }
     return ((TaskInfo[])this.tasks.toArray(new TaskInfo[this.tasks.size()]));
   }
 
   /**
    * 计算简单的运行耗时
    * @return
    */
   public String shortSummary()
   {
     return "StopWatch '" + this.id + "': running totalTime (millis) = " + getTotalTimeMillis();
   }
 
   /**
    * 计算详细的运行耗时（表格格式）
    * @return
    */
   public String prettyPrint()
   {
     StringBuilder sb = new StringBuilder(shortSummary());
     sb.append('\n');
     if (!(this.keepTasks)) {
       sb.append("No task info kept");
     } else {
       sb.append("-----------------------------------------\n");
       sb.append("ms/毫秒                     %/百分比                        taskName/任务名称\n");
       sb.append("-----------------------------------------\n");
       NumberFormat nf = NumberFormat.getNumberInstance();
       nf.setMinimumIntegerDigits(5);
       nf.setGroupingUsed(false);
       NumberFormat pf = NumberFormat.getPercentInstance();
       pf.setMinimumIntegerDigits(3);
       pf.setGroupingUsed(false);
       for (TaskInfo task : getTaskInfo()) {
         sb.append(nf.format(task.getTimeMillis())).append("       ");
         sb.append(pf.format(task.getTimeSeconds() / getTotalTimeSeconds())).append("         ");
         sb.append(task.getTaskName()).append("\n");
       }
     }
     return sb.toString();
   }
 
   /*
    * 计算详细的运行耗时（单行格式）
    *  (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   public String toString()
   {
     StringBuilder sb = new StringBuilder(shortSummary());
     if (this.keepTasks)
       for (TaskInfo task : getTaskInfo()) {
         sb.append("; [").append(task.getTaskName()).append("] took ").append(task.getTimeMillis());
         long percent = Math.round(100.0D * task.getTimeSeconds() / getTotalTimeSeconds());
         sb.append(" = ").append(percent).append("%");
       }
     else {
       sb.append("; no task info kept");
     }
     return sb.toString();
   }
 
   /**
    * 任务信息类
	 * @author 赵士杰
	 *
	 */
public static final class TaskInfo
   {
     private final String taskName;
     private final long timeMillis;
 
     TaskInfo(String taskName, long timeMillis)
     {
       this.taskName = taskName;
       this.timeMillis = timeMillis;
     }
 
     public String getTaskName()
     {
       return this.taskName;
     }
 
     public long getTimeMillis()
     {
       return this.timeMillis;
     }
 
     public double getTimeSeconds()
     {
       return (this.timeMillis / 1000.0D);
     }
   }
   
   
   /**
    * 一次统计的唯一标示
    */
   private final String id;
   private boolean keepTasks = true;
   private final List<TaskInfo> tasks = new LinkedList();
   private long startTimeMillis;
   private boolean running;
   private String currentTaskName;
   private TaskInfo lastTaskInfo;
   private int taskCount;
   private long totalTimeMillis;
   
   public static void main(String[] args) throws InterruptedException {
		StopWatchUtil stopWatch = new StopWatchUtil("测试过滤词导出功能性能消耗情况");

		stopWatch.start("任务1");
		Thread.sleep(2000); // simulated work
		stopWatch.stop();

		stopWatch.start("任务2");
		Thread.sleep(5000); // simulated work
		stopWatch.stop();

		stopWatch.start("任务3");
		Thread.sleep(3000); // simulated work
		stopWatch.stop();
		
		stopWatch.start("任务4");
		Thread.sleep(1000); // simulated work
		stopWatch.stop();

		System.out.println(stopWatch.prettyPrint()); 
		
		System.out.println(stopWatch.toString());
	}

   
   
   
 }