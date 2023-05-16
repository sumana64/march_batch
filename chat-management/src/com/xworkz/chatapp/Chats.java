package com.xworkz.chatapp;

public class Chats {


    static String chatNames[] = {null,null,null};

    static int index;

    public static boolean addChatNames(String chatName){

        boolean isAdded = false;

        if(chatName!= null && index<chatNames.length){

            chatNames[index++] = chatName;

            isAdded = true;

        }

        else {

            System.out.println("chatnames is exceded");
        }

        return isAdded;

    }

    public static void getChatNames(){

        System.out.println("inside the getchatnames");

        for(int i =0;i<chatNames.length;i++){

            String ref = chatNames[i];

            System.out.println("the ChatName is " + ref);

        }

    }




























}
