/*
 * Copyright (C) 2014 Trillian Mobile AB
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
 */
package org.robovm.samples.contractr.ios;

import org.robovm.samples.contractr.core.ClientModel;
import org.robovm.samples.contractr.core.Task;
import org.robovm.samples.contractr.core.TaskModel;

/**
 * 
 */
public class EditTaskViewController extends AbstractTaskViewController {
    
    private Task task;

    public EditTaskViewController(ClientModel clientModel, TaskModel taskModel) {
        super(clientModel, taskModel);
    }

    public void setTask(Task task) {
        this.task = task;
    }
    
    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        
        getNavigationItem().setTitle("Edit task");
    }
    
    @Override
    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
        
        updateViewValuesWithTask(task);
    }
    
    @Override
    protected void onSave() {
        taskModel.save(saveViewValuesToTask(task));
        super.onSave();
    }
    
}
