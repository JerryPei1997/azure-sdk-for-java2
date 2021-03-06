/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.Queries;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.TopQueries;

class QueriesImpl extends WrapperImpl<QueriesInner> implements Queries {
    private final SqlManager manager;

    QueriesImpl(SqlManager manager) {
        super(manager.inner().queries());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private TopQueriesImpl wrapModel(TopQueriesInner inner) {
        return  new TopQueriesImpl(inner, manager());
    }

    @Override
    public Observable<TopQueries> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        QueriesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<TopQueriesInner>, Observable<TopQueriesInner>>() {
            @Override
            public Observable<TopQueriesInner> call(List<TopQueriesInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<TopQueriesInner, TopQueries>() {
            @Override
            public TopQueries call(TopQueriesInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
