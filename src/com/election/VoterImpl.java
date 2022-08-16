package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter obj = new Voter();
        obj.setName("John");
        obj.setAge(19);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        String res = obj.ageCriteria();
        System.out.println(res);
    }
}
