package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.zip.DataFormatException;

public class Lesson_9_HomeWork {
    public static Random rand = new Random();

    public static void main (String[] args){

        String[][] array = new String [4][4];

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j] = ""+rand.nextInt();
            }
        }
        array[2][3] ="d";

        try {
            myArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        ;

    }

    public static void myArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (arr.length!=4){
            throw new MyArraySizeException("размер массива указан не верно!");
        } else{
            for (int i=0;i< arr.length;i++){
                if (arr[i].length!=4){
                    throw new MyArraySizeException("размер массива указан не верно!");
                }
            }
        }

       for (int i=0;i< arr.length;i++){
           for (int j=0;j< arr[i].length;j++) {

               try {
                   sum = sum + Integer.parseInt(arr[i][j]);
               } catch (NumberFormatException exception){
                   throw  new MyArrayDataException("Элемент массива с индексами "+i+" "+j+" не число");
               }
           }



           }
        System.out.printf("Сумма элементов массива равна "+sum);
       }
    }


