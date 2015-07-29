package org.freethemalloc.lessons;

import java.util.LinkedHashMap;

/**
 * Created by Harshana on 7/27/2015.
 */
public class Lesson {

    private static LinkedHashMap<Integer,String> LESSON_01;
    private static LinkedHashMap<Integer,String> LESSON_02;
    private static LinkedHashMap<Integer,String> LESSON_03;
    private static LinkedHashMap<Integer,String> LESSON_04;
    private static LinkedHashMap<Integer,String> LESSON_05;
    private static LinkedHashMap<Integer,String> LESSON_06;
    private static LinkedHashMap<Integer,String> LESSON_07;
    private static LinkedHashMap<Integer,String> LESSON_08;
    private static LinkedHashMap<Integer,String> LESSON_09;
    private static LinkedHashMap<Integer,String> LESSON_10;
    private static LinkedHashMap<Integer,String> LESSON_11;
    private static LinkedHashMap<Integer,String> LESSON_12;
    
    public static final int HEADER_LEVEL_1 = 24;
    public static final int HEADER_LEVEL_2 = 22;
    public static final int HEADER_LEVEL_3 = 20;
    public static final int HEADER_LEVEL_4 = 18;
    public static final int DESCRIPTION = 16;

    public static LinkedHashMap<Integer,String> getLesson01() {
        LESSON_01 = new LinkedHashMap<>();
        LESSON_01.put(HEADER_LEVEL_1,"තොරතුරු වල මුලික තෑනුම් ඒකක හා එහි ගති ලක්ෂණ (Basic Building Blocks of Information)");
        LESSON_01.put(HEADER_LEVEL_2,"දත්ත – හැදින්වීම (Introduction to Data)");
        LESSON_01.put(DESCRIPTION,"ලංකාවේ හැම වසර 10 කටම වරක්ම පවත්වන ජන සංගණනය සලකමු . සැම නිවසකටම පැමිණෙන ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමේන්තුවේ නියෝජිතයේක් ගෘහ මුලිකයාගෙ නම,ගෙදර කොපමණ සාමාජිකයෝ ඉන්නවද, ඒ අයගෙ නම් ,වයස ,ස්ත්\u200Dරි පුර්ෂ භාවය ආදී විශාල කරුණු ප්\u200Dරමාණයක්(facts) ,ස්ථිර පදිංචිය තහවුරු කරගෙන , සටහන් කර ගනී.ගෙදරට ලබාදී ඇති සංගනණ අංකයට මෙහි සුවිශේෂී ස්ථානයක් හිමි වී තිබෙනු දැකිය හැක .2011 ජන හා නිවාස සංගණනය භාවිතා කල පහත පත්\u200Dරිකව සහ එහි අවශ්\u200Dය කර ඇති කරුණු වෙත අවදානය යොමු කරන්න.");

        return LESSON_01;
    }

    public static LinkedHashMap<Integer,String> getLesson02() {
        return LESSON_02;
    }

    public static LinkedHashMap<Integer,String> getLesson03() {
        return LESSON_03;
    }

    public static LinkedHashMap<Integer,String> getLesson04() {
        return LESSON_04;
    }

    public static LinkedHashMap<Integer,String> getLesson05() {
        return LESSON_05;
    }

    public static LinkedHashMap<Integer,String> getLesson06() {
        return LESSON_06;
    }

    public static LinkedHashMap<Integer,String> getLesson07() {
        return LESSON_07;
    }

    public static LinkedHashMap<Integer,String> getLesson08() {
        return LESSON_08;
    }

    public static LinkedHashMap<Integer,String> getLesson09() {
        return LESSON_09;
    }

    public static LinkedHashMap<Integer,String> getLesson10() {
        return LESSON_10;
    }

    public static LinkedHashMap<Integer,String> getLesson11() {
        return LESSON_11;
    }

    public static LinkedHashMap<Integer,String> getLesson12() {
        return LESSON_12;
    }
}
