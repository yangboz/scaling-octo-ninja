/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * All rights reserved.
 */
package com.sample.model;

/**
 * @see http://www.mastertheboss.com/jboss-jbpm/drools/using-the-drools-guvnor-repository-to-store-your-rules
 * @author yangboz
 */
public class Account
{
    private Integer balance;

    public Account()
    {
    }

    public Integer getBalance()
    {
        return balance;
    }

    public void setBalance(Integer balance)
    {
        this.balance = balance;
    }

    public Account(Integer balance)
    {
        super();
        this.balance = balance;
    }

    public void withdraw(int money)
    {
        balance -= money;
    }
}
