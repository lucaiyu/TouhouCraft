package com.lucaiyu.touhoucraft.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;

import java.util.ArrayList;

public class Dialogue {
    public static boolean jump = false;
    private int message_counter = 0;
    private ArrayList<String> DialogueList = new ArrayList<>();
    private MatrixStack matrixStack;
    public Dialogue(int dialogue_id, MatrixStack matrixStack){
        this.matrixStack = matrixStack;
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
    public void RenderDialogue(){
        Capture capture = new Capture(this.matrixStack);
        capture.render(5, DialogueList.get(this.message_counter));
        if (jump == true) {
            this.message_counter++;
        }
    }
}
