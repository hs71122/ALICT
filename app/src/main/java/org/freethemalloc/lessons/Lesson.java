package org.freethemalloc.lessons;

import org.freethemalloc.alict.R;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Harshana on 7/27/2015.
 */
public class Lesson {

    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_01;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_02;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_03;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_04;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_05;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_06;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_07;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_08;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_09;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_10;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_11;
    private static LinkedHashMap<Integer,HashMap<Integer,String>> LESSON_12;
    
    public static final int HEADER_LEVEL_1 = 24;
    public static final int HEADER_LEVEL_2 = 22;
    public static final int HEADER_LEVEL_3 = 20;
    public static final int HEADER_LEVEL_4 = 18;
    public static final int DESCRIPTION = 16;
    public static final int DESCRIPTION_LIST = 15;
    public static final int IMAGE = 0;


    /**
     * Generate a <b>LinkedHashMap object</b> with given values
     * @param key Key for the map
     * @param value value for the map
     * @return HashMap<Integer,String>()
     */
    private static HashMap<Integer,String> hashMapGenerator(int key, String value){
        HashMap<Integer,String> newHashMap = new HashMap<>();
        newHashMap.put(key,value);
        return newHashMap;
    }

    /**
     * Get the lesson 01 details as a HashMap object
     * @return LinkedHashMap<Integer,HashMap<Integer,String>()
     */
    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson01() {
        LESSON_01 = new LinkedHashMap<>();
        LESSON_01.put(1,hashMapGenerator(HEADER_LEVEL_1,"තොරතුරු වල මුලික තෑනුම් ඒකක හා එහි ගති ලක්ෂණ (Basic Building Blocks of Information)"));
        LESSON_01.put(2,hashMapGenerator(HEADER_LEVEL_2,"දත්ත – හැදින්වීම (Introduction to Data)"));
        LESSON_01.put(3,hashMapGenerator(DESCRIPTION,"ලංකාවේ හැම වසර 10 කටම වරක්ම පවත්වන ජන සංගණනය සලකමු . සැම නිවසකටම පැමිණෙන ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමේන්තුවේ නියෝජිතයේක් ගෘහ මුලිකයාගෙ නම,ගෙදර කොපමණ සාමාජිකයෝ ඉන්නවද, ඒ අයගෙ නම් ,වයස ,ස්ත්\u200Dරි පුර්ෂ භාවය ආදී විශාල කරුණු ප්\u200Dරමාණයක්(facts) ,ස්ථිර පදිංචිය තහවුරු කරගෙන , සටහන් කර ගනී.ගෙදරට ලබාදී ඇති සංගනණ අංකයට මෙහි සුවිශේෂී ස්ථානයක් හිමි වී තිබෙනු දැකිය හැක .2011 ජන හා නිවාස සංගණනය භාවිතා කල පහත පත්\u200Dරිකව සහ එහි අවශ්\u200Dය කර ඇති කරුණු වෙත අවදානය යොමු කරන්න."));
        LESSON_01.put(4,hashMapGenerator(IMAGE, String.valueOf( R.drawable.lesson1_img_1)));
        LESSON_01.put(5,hashMapGenerator(DESCRIPTION,"මෙලෙස ලංකාවේ සැම ගෘහයකින්ම එකතු කරගත් පත්\u200Dරිකා,සුවිශේෂ ක්\u200Dරියාවලියකින් පසු ,ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමෙන්තුව පහත දක්වෙන කෙටි වගු වලට පරිවර්තනය කරයි.මෙය ඉහත කරුණු එක් ස්වරුපයක(facts) සිටවෙනත් ස්වරුපයකට පරිවර්තනයක් ලෙස සැලකිය හැක."));
        LESSON_01.put(6,hashMapGenerator(IMAGE, String.valueOf( R.drawable.lesson1_img_2)));
        LESSON_01.put(7,hashMapGenerator(DESCRIPTION,"කුඩා අවදියේ පටන්කරුණු සංශිප්තව දැක්වීමට අප වගු සටහන් භාවිතා කරයි. ඉහත සංශිප්තව දක්වා ඇති ,මධය වාර්ෂික ජනගහනය,ජන ඝනත්වය,වාර්ෂික උපත් මරණ අනුපතය ආදිය උපුටගෙන නොයෙකුත් සැසදිම් ,ව්ශ්ලේෂ හා නිගමන ඉදිරිපත් කරන අතර මෙය ඉදිරි කටයුතු පිබුරුපත් කිරීමටත් ඉතාම වැදගත්.මෙහිදී එළබෙන නිගමන වඩාත් සංශිප්ත වන අතර නව සවරුපයක වඩාත් වැදගත් කරුණකි. ( උදා : එක් ,එක් දිස්ත්\u200Dරිකයකින් පාර්ලිමේන්තුවේ නියෝගනය කරන අසුන් ගණන වෙනස්  කිරීම)"));
        LESSON_01.put(8,hashMapGenerator(DESCRIPTION,"පත්\u200Dරිකාව  නිවැරදිව සම්පූර්ණ කල විට ,මෙය කියවන ඔබ ඇතුළු ඔබේ පවුලේ සාමාජිකයින් මධය වාර්ෂික ජනගහනයට දායකවී ඇති බව  පැහැදිලි වේ .නමුත් ,පවුලේ සාමාජිකයින් ගණන පමණක් රටේ මුළු ගනගාහනය සාපේක්ෂව  සැලකු විට, පරිපාලකයන්ට නොසැලකිය හැකි තරම් කුඩා නොවැදගත් අගයකි."));
        LESSON_01.put(9,hashMapGenerator(DESCRIPTION,"එනමුත් ගෙදර කොපමන් සංඛ්\u200Dයාවක් ඉන්නවද යන්න නිගමන, තිරණ ගන්න වැදගත්වන අවස්ථා නැතුවාක් නොවේ.උදාහරණයක් වශයෙන් ඔබගේ මව ආහාර පිසීමට පෙර ගෙදර එදින කොපමණ සංඛ්\u200Dයාවක් සිටීද යන්න විමසා බලන අවස්ථාව සලකන්න."));
        LESSON_01.put(10,hashMapGenerator(DESCRIPTION,"තොරතුරු හා සන්නිවේදන තාක්ෂණයට අත්පොත් තබන නංගිලා මල්ලිලාට පහත දැක්වෙන කරුණු මිට ඉහතදී සමහර අවස්ථා වල ගැටළුවක් වන්නට ඇත.හේතුව මේ වන විට අවබෝධ කරගෙන සිටීමටත් පුලුවන් ."));
        LESSON_01.put(11,hashMapGenerator(DESCRIPTION_LIST,"╬ එක් රැස් කරගත් පත්\u200Dරිකා කිසිදු වෙනසකට භාවිතා නොකර ,ලංකාව ගැන ව්ශ්ලේෂ හා නිගමන කිරීමට හැකිද?"));
        LESSON_01.put(12,hashMapGenerator(DESCRIPTION_LIST,"╬ නිවාස දෙකක් පමණක් සැසදීමට ,කොට්ඨාශ දෙකක් පමණක් සැසදීමට, ඉහත සංශිප්ත වගුව සුදුසුද ? (වටහ ගන්න පුලුවන්)"));
        LESSON_01.put(13,hashMapGenerator(DESCRIPTION_LIST,"╬ පත්\u200Dරිකවල අඩංගු කරුණු වෙනත් ස්වරුපයකට පත් කලවිට , වෙනත් පාර්ශවයක් එයට ඉහල වටිනාකමක් ලබාදෙන්නේ ඇයි?"));
        LESSON_01.put(14,hashMapGenerator(DESCRIPTION_LIST,"╬ එක පුද්ගලයකුට වැදගත් වන පත්\u200Dරිකාවක් හෝ පත්\u200Dරිකා තවත් පුද්ගලයකුට ඒ හා සමානව වැදගත් නොවන්නේ ඇයි?"));
        LESSON_01.put(15,hashMapGenerator(DESCRIPTION,"හේතුව තමයි දත්ත වල බහුමාධ්\u200Dය ආකාරයෙන් පැවතීම"));

        LESSON_01.put(16,hashMapGenerator(HEADER_LEVEL_2,"දත්තවල නිර්වචනය(Data Definition)"));
        LESSON_01.put(17,hashMapGenerator(HEADER_LEVEL_3,"අර්ථ රහිත (Meaningless)"));
        LESSON_01.put(18,hashMapGenerator(DESCRIPTION,"අර්ථ රහිත ( අර්ථ විරහිත ) කියලා කියන්නේ දත්ත දැනට පවතින ආකාරයෙන් භාවිතා කරන්නාගේ අරමුණ සම්පුර්න කරගන්න බැරි නිසා .ඒ කියන්නේ පවතින අර්ථ විරහිත ආකාරයේ සිට අර්ථාන්විත ආකාරයකට පත් කරන්න ඕනේ. ජන සංගණනයේ  සැසදිම් ,ව්ශ්ලේෂ හා නිගමන ඉදිරිපත් කරන අයට ගෙවල් වලින් එකතු කරපු පත්\u200Dරිකා වලින් කෙලිම නිගමන වලට පැමිණීම ප්\u200Dරයෝගික නැහැ. එවැනි විශ්ලේෂණයක් පිළිගැනීමට ලක්වෙන්නේ නැත්තේ යොදාගත් දත්ත අර්ථාන්විත ආකාරයකට( සංශිප්ත ,වගුගත , ලංකාවේම කරුණු ඇතුලත් ) අකාරයට පත්කර නැති නිසා. විශ්ලේෂකයන්ට අනුව පත්\u200Dරිකා වල අඩංගු වෙන්න දත්ත ලෙස සැලකිය හැකියි."));
        LESSON_01.put(19,hashMapGenerator(HEADER_LEVEL_3,"අසංවිධි (Not organized)"));
        LESSON_01.put(20,hashMapGenerator(DESCRIPTION,"සැම පත්\u200Dරිකාවකම එම නිවසේ කරුණු බොහොමයක් අඩංගුයි. එක එක පත්\u200Dරිකාව අරන් කියන්න හැකි වෙන්නේ ඒ ඒ නිවසේ විස්තර විතරයි. ලකාවේ තොරතුරක් ලබා ගන්න තවදුරත් දත්ත සවිධානය කල යුතුයි .  ලංකාවේ ඉන්න පුද්ගලෙක් ගේ නම,  ජාතික හැදුනුම්පත් අංකය දන්නවානම් තහවුරු කරගන්න  ,මේ හැම පත්\u200Dරිකාවකම නිවැසියන්ගේ  නම හෝ ජාතික හැදුනුම්පත් අංකයට (NIC) සමඟ සටහන් කරගන්න වෙනවා. උදාහරණයක \u200Cලංකාවේ ඉන්නේ හැමෝගෙ නම සමග වයස දන්නවා නම්, ඔබගේ වයසේ කි දෙනෙක් ඉන්නවාද ඇසුවොත්, අපිට ඒ දත්ත අවම වශයෙන් කණ්ඩායම් දෙකකට බෙදාගන්නවත් වෙනවා.ඊට පස්සේ අපේ වයසට සමාන කණ්ඩායමේ කි දෙනෙක් ඉන්නවද කියලා ගනින්න (count) ඕනේ .දත්ත සංවිධානය කරන්න බහුලව සංඛ්\u200Dයානය (Statistics) භාවිතා කරන්න පුළුවන් කියලා දැන් ඔය ගොල්ලන්ට තේරෙනවා ඇති ."));
        LESSON_01.put(21,hashMapGenerator(HEADER_LEVEL_3,"අවිධිමත් – ( Informal )"));
        LESSON_01.put(22,hashMapGenerator(DESCRIPTION,"දත්ත පිහිටන ආකාරය අනුව භාවිතා කරන්නා අවිධිමත් ලෙස වර්ග කරන්න පුළුවන් . දත්ත එක්රැස් කිරීමේදී මූලික අර්ථයෙන් ලබාගන්නා(source format) දත්ත අසම්පුරන වෙන්න පලුවන්. උදාහරණයට හැටියට සමහර වයසක අයගේ ජාතික හැදුනුම්පත් ලබාගන්න බැරි වෙන්න පලුවන්.එවැනි අවස්ථාවක පත්\u200Dරිකාවේ  අනිවාර්ය දත්ත පවා මගහැරී තියෙන්න පුළුවන්. ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමේන්තුව ඉහත ආකාරයේ සම්මතව පත්\u200Dරිකාවක් නිදේශ කර නොතිබුනානම් , නියෝජිතයන් විවිධ පත්\u200Dරිකා සකස්කර ( විවිධ පිලිවල , විවිධ හදුන්වන නාම ) ලබාදෙන්නේ පලුවන්. එවිට පත්\u200Dරිකාවල අවිධිමත් බව වැඩි වෙනවා."));

        LESSON_01.put(23,hashMapGenerator(HEADER_LEVEL_2,"දත්ත පිහිටන ආකාර -( Types of Data Forms )"));
        LESSON_01.put(24,hashMapGenerator(DESCRIPTION,"දත්ත එක්රැස් කරන කොට ඒවා ප්\u200Dරදාන වශයෙන් ආකාර 3 කට පවතිනවා."));
        LESSON_01.put(25,hashMapGenerator(HEADER_LEVEL_3,"╬ ලිඛිත සටහන් (Text )"));
        LESSON_01.put(26,hashMapGenerator(IMAGE, String.valueOf( R.drawable.lesson1_img_3)));
        LESSON_01.put(27,hashMapGenerator(DESCRIPTION,"දත්ත රස කරන ප්\u200Dරධාන මාධ්\u200Dයක් වෙන්නේ ලිඛිත සටහන්. ලියන්න හැකි ඕනෑම කෙනෙකුට, දත්ත කොලයක හෝ ජංගම දුරකථනයක සටහන් කර ගන්න පලුවන්. පුද්ගලයෙකුට එදිනෙදා වැදගත් වෙන ,දුරකථන අංක ,ගමන් කළ ස්ථාන, ස්ථාන අතර දුර , බැංකු ගිණුම් අංක සහ තවත් බොහෝ දේවල් ලිඛිත දත්ත ලෙස සලකන්න පලුවන්.තේරුම් ගත නොහැකි අපිළිවෙල සංකේත කිහිපයක් රහස් භාෂාවක දත්තයක් වෙන්න පලුවන්."));
        LESSON_01.put(28,hashMapGenerator(DESCRIPTION,"දත්ත එකතු කිරීම ගවේෂනයෙන් (observation ) හෝ ප්\u200Dරශ්න ඇසීමෙන් (questioning ) හෝ දත්ත එක්රැස් කරන විශේෂ උපකරණයක සටහන් කර ගන්න පලුවන්.උදාහරනයක් විදියට කොනමනය ,උනකටුව ගන්න පලුවන්. පරිගණකය සොයා පෙර දත්ත කළමනාකරණය කිරීමට file system භාවිතා කලා. එවැන්නක් මුලාශ දත්ත සකස්කර ,ගොණුකර තැබුවෙත ලිඛිත සටහන් ලෙසින්. ලිඛිත සටහන් පසුව කායික ක්\u200Dරම (manual) හෝ ප්\u200Dරකාශ සලකුණු කියවනය (OMR) ,ප්\u200Dරකාශ අනුලක්\u200Dෂණ කියවනය (OCR) ආදී ස්වයංක්\u200Dරිය ක්\u200Dරම මගින් පරිගණකයට feed කරන්න පලුවන්."));
        LESSON_01.put(29,hashMapGenerator(HEADER_LEVEL_3,"╬ ශ්\u200Dරව්\u200Dය (Audio ) "));
        LESSON_01.put(30,hashMapGenerator(IMAGE, String.valueOf( R.drawable.lesson1_img_3)));
        LESSON_01.put(31,hashMapGenerator(DESCRIPTION,"කම්පන අකාරයට ඇති සන්තතික (continuous) ශබ්ද තරංග microphone දියුණුවත් සමග විද්\u200Dයුත් තරංගයක් (electric signal ) බවට පරිවර්තනය (convert) කිරීමට හැකි උනා.පරිගණක තාක්ෂණයේ සහ සන්නිවේදන තාක්ෂණයේ දියුණුවත් සමගම මෙම electric signal එක පරිගණකයට තේරුම් ගතහැකි ද්විමය (Binary) විද්\u200Dයුත් තරංගයක් බවට පරිවර්තනය කර feed කිරීමට දැන් පුළුවන්. මෙම ක්\u200Dරියාවලිය විස්තරාත්මකව 8. දත්ත හා සන්නිවේදනය පාඩමේදී දැනගන්න පලුවන්. මෙහිදී විවිධ microphone අවශ්\u200Dයතාව අනුව යොදාගන්නවා.උදාහරන ලෙස සංගීතඥයා vocal recoding microphone එකක් බාවිතා කරන අතර රහස් පරීක්ෂක කටයුතු සදහා සංවේදී කුඩා microphone භාවිතා වෙනවා .ශබ්ද තරංග පරිගණකය feed කිරීමෙන් මූලික වශයෙන් ශබ්ද තරංග ලෙස ප්\u200Dරතිදානය ලබාගැනීමත් , සැකසීමත් (උදාහරනයක් ලෙස ඝෝෂාව ඉවත් කිරීම ) බලාපොරත්තු වෙනවා ."));
        LESSON_01.put(32,hashMapGenerator(HEADER_LEVEL_3,"╬ දෘශ\u200Dය(Video)"));
        LESSON_01.put(33,hashMapGenerator(IMAGE, String.valueOf( R.drawable.lesson1_img_5)));
        LESSON_01.put(34,hashMapGenerator(DESCRIPTION,"ශබ්ද තරංග පරිගණකයට සාර්ථකව feed කිරීමත් සමගම දෘශ්\u200Dය මාධ්\u200Dයයෙන් දත්ත ඇතුලත් කිරීමත් හැකි උනා . මෙහිදී ප්\u200Dරදාන වශයෙන් Digital Camera බාවිතයට ගන්නවා. Digital Camera තුල දත්ත ගබඩා කරන්නේ ද්විමය (Binary) විද්\u200Dයුත් තරංග ආකාරයටමය.සැබවින්ම මෙහිදී වීඩියෝ වක් ,අනුපිලිවලකට ඇති නිශ්චල ඦායාරූප වල එකතුවක් ලෙස සලකන්න පලුවන්. පරිගණකයට තේරුම් ගතහැකි ද්විමය (Binary) මාධ්\u200Dයට පරිවතනයේදී මෙම නිශ්චල  ඦායාරූප ඉතා කුඩා කොටු (pixel) වලට වෙන් කිරීම හෝ දෛශික ගණිතමය සමීකරණ අකාරයට පත් කරනවා. සරළ වෙබ් camera සිට Augmented Reality තාක්ෂණයේදී බාවිතා වෙන අධි සංවේදී සංවේදක (sensors) දක්වා මෙම Digital Camera විකාශය වෙලා තියෙනවා ."));
        return LESSON_01;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson02() {
        return LESSON_02;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson03() {
        return LESSON_03;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson04() {
        return LESSON_04;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson05() {
        return LESSON_05;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson06() {
        return LESSON_06;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson07() {
        return LESSON_07;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson08() {
        return LESSON_08;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson09() {
        return LESSON_09;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson10() {
        return LESSON_10;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson11() {
        return LESSON_11;
    }

    public static LinkedHashMap<Integer,HashMap<Integer,String>> getLesson12() {
        return LESSON_12;
    }
}
