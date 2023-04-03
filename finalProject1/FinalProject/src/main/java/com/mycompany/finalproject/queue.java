/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author Rafael
 */
public class queue {
    
    private ListNode front;
    private ListNode rear;
    private int length;
    
        private class ListNode {
        private int data;
        private ListNode next;

            public ListNode(int data){
                this.data = data;
                this.next = null; 
            }
        }
        
    public int  length(){
        
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    
}

