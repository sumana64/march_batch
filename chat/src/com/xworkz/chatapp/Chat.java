package com.xworkz.chatapp;

public class Chat {

              String chatNames[] = new String[5];

              int index;

              public boolean saveChatName(String chatName){

                  boolean isAdded = false;

                  if(chatName!=null && index<chatNames.length){

                       chatNames[index++] = chatName;

                          isAdded = false;

                  }
                return isAdded;
              }

              public void getChatNames(){

                  for(int i=0;i<chatNames.length;i++){

                      System.out.println(chatNames[i]);

                  }



              }


}


