package com.github.mygreen.sqltemplate;

import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * SQLテンプレートに渡すパラメータがないときのコンテキスト。
 *
 *
 * @author T.TSUCHIE
 *
 */
public class EmptyValueSqlContext extends SqlContext {

    @Override
    public StandardEvaluationContext createEvaluationContext() {
        return new StandardEvaluationContext();
    }
}
