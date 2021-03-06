/*-
 * <<
 * UAVStack
 * ==
 * Copyright (C) 2016 - 2017 UAVStack
 * ==
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
 * >>
 */

package com.alibaba.ttl;

public class MultipleInterfaceRunnable implements Runnable, Comparable<Runnable> {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Runnable o) {

        return 0;
    }

    private int id;

    public MultipleInterfaceRunnable(int i) {

        this.id = i;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {

        System.out.println("before" + id + "---" + TtlCase.THREAD_LOCAL.get());
        TtlCase.THREAD_LOCAL.set(id + "");
        System.out.println("after" + id + "---" + TtlCase.THREAD_LOCAL.get());
    }

}
