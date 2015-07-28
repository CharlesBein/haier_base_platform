package cn.gooday.service.common;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 *
 */
public class CleanupFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {
            System.out.println("start invoke.. [" + Thread.currentThread().getName());
            return invoker.invoke(invocation);
        }
        finally {
            System.out.println("end invoke");
//            DataSourceHolder.cleanup();
//            FrameworkHelper.cleanup();

        }
    }
}
