package com.lucaiyu.touhoucraft.gui;

import java.util.ArrayList;

public class Dialogue {
    public static boolean jump = false;
    public int message_counter = 0;
    public ArrayList<String> DialogueList = new ArrayList<>();
    public Dialogue(int dialogue_id){
        switch (dialogue_id){
            case 0: {
                this.DialogueList.add("Sentence 1");
                this.DialogueList.add("sentence 2");
                this.DialogueList.add("Sentence 3");
                this.DialogueList.add("Sentence 4");
                break;
            }
            default:{
                throw new RuntimeException("Invalid dialogue id!");
            }
        }
    }
}
