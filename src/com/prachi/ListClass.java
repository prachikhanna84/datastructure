package com.prachi;

public class ListClass {

    String[] list = null;
    int pointer=0;

    int size =0 ;

    public ListClass(){
        list = new String[10];

    }

    ListClass(int size){
        list = new String[size];

    }

    public void addElements(String element){
        if(pointer<=list.length-1) {
            list[pointer] = element;
            ++pointer;
        }
        else{
            String[] newlist = new String[(list.length * 2)];
            System.arraycopy(list,0,newlist,0,list.length);
            list=newlist;
            list[pointer]=element;
            ++pointer;
        }
    }

    public void remove(String element){
        int index = contains(element);
        int prev=index;
        int next=index+1;
        while(index<=size-2){
            list[prev]=list[next];
            System.out.println("Elemet at " + index + " is " + list[index]);
            prev=prev+1;
            next=next+1;
            index=index+1;
        }
        list[index]=null;
        pointer--;

    }


    public int getSize(){
        size = 0 ;
        for(int i =0 ;i<=list.length;i++){
            if(list[i]==null){
                return size;
            }
            else{
                 ++size;
            }
        }
        return size;
    }

    public void display(){
        getSize();
        for (int i =0;i<=size-1;i++) {
            System.out.println(list[i]);
        }
    }

    public int contains(String element){
        getSize();
        for(int i=0;i<size;i++){

            if(list[i].equalsIgnoreCase(element)){
                return i;
            }

        }
        return -1;
    }

    public void insertAt(int index,String data){
        getSize();
        int current = size;
        int prev = size -1 ;
        for(int i = size-1;i>=index;i--){
            list[current]=list[prev];
            current--;
            prev--;
        }
        list[index]=data;
        pointer++;
    }


}
