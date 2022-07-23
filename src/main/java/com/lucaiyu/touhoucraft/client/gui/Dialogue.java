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
    public void RenderDialogue(){
        Capture capture = new Capture(this.matrixStack);
        capture.render(5, DialogueList.get(this.message_counter));
        System.out.println("Before" + message_counter +" " +jump);
        if (jump) {
            this.message_counter++;
            jump = false;
            System.out.println("In" + message_counter +" " +jump);
        }
        if (this.message_counter >= 3){
            this.message_counter = 0;
        }
        System.out.println("After" + message_counter +" " +jump);
    }
}
