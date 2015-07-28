package cn.gooday.logistics.web.common.vo;

import java.util.List;

/**
 * 
 * @author zhangsg
 *
 * @param <T>
 */
public class QueryResult<T> {
	private List<T> records;

	private long totalCount;
	
	public QueryResult(){
		
	}
	
	public QueryResult(List<T> records,long totalCount){
		this.records=records;
		this.totalCount=totalCount;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
	public static <T> QueryResult<T> newResult(List<T> records,long totalCount){
		
		return new QueryResult<T>(records,totalCount);
		
		
	}

}
