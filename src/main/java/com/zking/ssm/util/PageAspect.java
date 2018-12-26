package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.jsqlparser.expression.operators.relational.OldOracleJoinBinaryExpression;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class PageAspect {

    @Around("execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable {
        Object[] param = args.getArgs();
        PageBean pageBean=null;
        for (Object obj:param) {
            if(obj instanceof PageBean) {
                pageBean = (PageBean) obj;
                break;
            }
        }
        if(null!=pageBean && pageBean.isPagination())
            PageHelper.offsetPage(pageBean.getPage(),pageBean.getRows());

        Object proceed = args.proceed(param);
        List list=(List)proceed;
        if(null!=pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            System.out.println("页码：" + pageInfo.getPageNum());
            System.out.println("页大小：" + pageInfo.getPageSize());
            System.out.println("总记录：" + pageInfo.getTotal());
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        System.out.println("pagebean的总记录："+pageBean);
        return proceed;
    }
}
