/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#countPendingActivityTasks(CountPendingActivityTasksRequest) CountPendingActivityTasks operation}.
 * <p>
 * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and is not guaranteed to be exact.
 * If you specify a task list that no activity task was ever scheduled in then 0 will be returned.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#countPendingActivityTasks(CountPendingActivityTasksRequest)
 */
public class CountPendingActivityTasksRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain that contains the task list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The name of the task list.
     */
    private TaskList taskList;

    /**
     * The name of the domain that contains the task list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain that contains the task list.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain that contains the task list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the task list.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain that contains the task list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain that contains the task list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CountPendingActivityTasksRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * The name of the task list.
     *
     * @return The name of the task list.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The name of the task list.
     *
     * @param taskList The name of the task list.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The name of the task list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The name of the task list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CountPendingActivityTasksRequest withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (domain != null) sb.append("Domain: " + domain + ", ");
        if (taskList != null) sb.append("TaskList: " + taskList + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CountPendingActivityTasksRequest == false) return false;
        CountPendingActivityTasksRequest other = (CountPendingActivityTasksRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        return true;
    }
    
}
    