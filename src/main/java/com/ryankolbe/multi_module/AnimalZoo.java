package com.ryankolbe.multi_module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalZoo {

    static List<String> animalModelList = new ArrayList<>();
    static AnimalActionInterface animalActionInterface;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        animalModelList.add("Wolf");
        animalModelList.add("Otter");
        animalModelList.add("Bird");
        JOptionPane.showMessageDialog(null, "Please enter one the following");
        String selection = JOptionPane.showInputDialog(null, animalModelList);
        while (animalModelList.contains(selection)) {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfig.class);
            animalActionInterface = (AnimalActionInterface) applicationContext.getBean("Bird");
            System.out.println(animalActionInterface.animalAction(selection));
            selection = null;
        }
    }
}
