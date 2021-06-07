package com.company;

public class Main {

    public static void main(String[] args) {
	Menu[] menu = new Menu[]{
	        new AddTaskMenuItem(),
            new ShowTaskMenuItem(),
            new ShowCompletedTaskMenuItem(),
            new ShowUnfulfilledTaskMenuItem(),
            new TaskCompleteMenuItem()

    };

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %s \n",i+1,menu[i].getMenuItem());
        }
    }
}
