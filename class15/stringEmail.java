package com.syntax.class15;

public class stringEmail {
    String completeEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        stringEmail task=new stringEmail();

        System.out.println(task.completeEmail("emre", "akbayrak","gmail"));
    }
}
