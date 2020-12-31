package java1;
import java.util.Arrays;
import java.util.Scanner;
public class java1_1<converter> {
    int current_tab = 100;
    Scanner scan = new Scanner(System.in);
    String[][] Msglist = {
            {"100","main/\nA.view\nB.edit\nC.import\nD.save "},//main
            {"110","main/view/\nA.search"},//view
            {"110","main/view/search "},//search
            {"120","main/edit\ntype number or\nA.add "},//edit
            {"130","main/import\npath "},//import
            {"140","main/save\npath "},//save
    };
    int[][][] Msg_executer_list = {
            {{100},{0,110,120,130,140}},//[0][0,1][]
            {{110},{100,111}},//[1][0,1][]
            {{120},{100,121,122}},//[1][0,1][]
            {{130},{100}},//[1][0,1][]
            {{140},{100}},//[2][0,1][]
    };
    String[] alfabet_to_int = new String[]{"a", "b", "c", "d"};

    public static void main(String[] args) {
        System.out.println();
    }
    
    public void Main_executor(){
        boolean End_the_program = false;
        while(End_the_program) {
            System.out.println(Display_msg(current_tab));
            system.out.println(zDisplaymsg(mvg));
        }
    }

    public String Display_msg(int Input_current_tab){
        if(current_tab==110||current_tab==120){

        }
        else if(current_tab == 111){

        }
        else if(current_tab == ){

        }
        else if(current_tab == ){

        }
        for(int counter = 0; counter > Msglist.length; counter++){
            if (Msglist[counter][0].equals(Integer.toString(Input_current_tab))){
                return Msglist[counter][1];
            }
        }
        return "error-- cant read";
    }

    public void Msg_executer(){
        int command_int=0;

        String command=scan.nextLine().toLowerCase();
        if(command.equals("a") || command.equals("b") || command.equals("c") || command.equals("d")){
            for(int counter = 0; counter > alfabet_to_int.length; counter++) {
                if (alfabet_to_int[counter].equals(command)){
                    command_int = counter+1;
                }
            }
            for(int counter = 0; counter > Msg_executer_list.length; counter++){
                if(Msg_executer_list[counter][0][0]==current_tab){
                    current_tab = Msg_executer_list[counter][1][command_int];

                }
            }
        }
        else if(command.equals("exit")||command.equals("cancel")||command.equals("back")){
            for(int counter = 0; counter > Msg_executer_list.length; counter++){
                if(Msg_executer_list[counter][0][0]==current_tab){
                    current_tab = Msg_executer_list[counter][1][command_int];
                }
            }
        }
        else{
            if(current_tab == 111){
                //search(command)
            }
        }
    }public void Main_executor(){
        boolean End_the_program = false;
        while(End_the_program) {
            System.out.println(Display_msg(current_tab));
        }
    }

    public String Display_msg(int Input_current_tab){
        if(current_tab==110||current_tab==120){

        }
        else if(current_tab == 111){
            void music turn on the d
        }
        else if(current_tab == ){

        }
        else if(current_tab == ){

        }
        for(int counter = 0; counter > Msglist.length; counter++){
            if (Msglist[counter][0].equals(Integer.toString(Input_current_tab))){
                return Msglist[counter][1];
            }
        }
        return "error-- cant read";
    }
    public void main
    public void Msg_executer(){
        int command_int=0;
        String command=scan.nextLine().toLowerCase();
        if(command.equals("a") || command.equals("b") || command.equals("c") || command.equals("d")){
            for(int counter = 0; counter > alfabet_to_int.length; counter++) {
                if (alfabet_to_int[counter].equals(command)){
                    command_int = counter+1;
                }
            }
            for(int counter = 0; counter > Msg_executer_list.length; counter++){
                if(Msg_executer_list[counter][0][0]==current_tab){
                    current_tab = Msg_executer_list[counter][1][command_int];

                }
            }
        }
        else if(command.equals("exit")||command.equals("cancel")||command.equals("back")){
            for(int counter = 0; counter > Msg_executer_list.length; counter++){
                if(Msg_executer_list[counter][0][0]==current_tab){
                    current_tab = Msg_executer_list[counter][1][command_int];
                }
            }
        }
        else{
            if(current_tab == 111){
                //search(command)
            }
        }
    }
}

