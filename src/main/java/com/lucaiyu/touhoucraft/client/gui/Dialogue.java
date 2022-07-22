package com.lucaiyu.touhoucraft.client.gui;

import java.util.ArrayList;

public class Dialogue {
    public static boolean jump = false;
    public int message_counter = 0;
    public ArrayList<String> DialogueList = new ArrayList<String>();
    public Dialogue(int dialogue_id){
        switch (dialogue_id){
            case 0: {
                this.DialogueList.add("落ち葉で視界が良くないわね");
                this.DialogueList.add("こんな調子で山に立ち入って大丈夫かしら？");
                this.DialogueList.add("あれ？");
                this.DialogueList.add("何だか美味しそうな匂いが……");
                break;
            }
            default:{
                throw new RuntimeException("Invalid dialogue id!");
            }
        }
    }
}
