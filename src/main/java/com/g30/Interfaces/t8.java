package com.g30.Interfaces;

import java.util.HashMap;
import java.util.Map;

public class t8 implements t8Interface{

    public static Map<Integer, String> RobotList() {
        Map<Integer, String> robot = new HashMap<>();

        robot.put(0, "Randoop EASY");
        robot.put(1, "Randoop HARD");
        robot.put(2, "Evo Suite EASY");
        robot.put(3, "Evo Suite HARD");

        return robot;
    }
}
