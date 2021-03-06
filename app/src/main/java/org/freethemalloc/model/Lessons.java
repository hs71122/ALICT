package org.freethemalloc.model;

import org.freethemalloc.alict.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 7/27/2015.
 */

/**
 * A class which is provide lesson details. This class contain set of <b>{@link LinkedHashMap }</b>
 * and all the <b>{@link LinkedHashMap }</b>  of the lessons details can get By calling {@link static}
 * methods od class
 */
public class Lessons {

    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_01;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_02;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_03;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_04;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_05;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_06;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_07;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_08;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_09;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_10;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_11;
    private static LinkedHashMap<Integer, HashMap<Integer, String>> LESSON_12;

    public static final int HEADER_LEVEL_1 = 24;
    public static final int HEADER_LEVEL_2 = 22;
    public static final int HEADER_LEVEL_3 = 20;
    public static final int HEADER_LEVEL_4 = 18;
    public static final int DESCRIPTION = 16;
    public static final int DESCRIPTION_LIST = 15;
    public static final int IMAGE = 0;
    public static final int IMAGE_DESCRIPTION = 12;


    /**
     * Generate a <b>{@link LinkedHashMap} object</b> with given values
     *
     * @param key   {@link int} Key for the map
     * @param value {@link String}value for the map
     * @return {@link HashMap }
     */
    private static HashMap<Integer, String> hashMapGenerator(int key, String value) {
        HashMap<Integer, String> newHashMap = new HashMap<>();
        newHashMap.put(key, value);
        return newHashMap;
    }

    /**
     * Get the lesson 01 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson01() {
        LESSON_01 = new LinkedHashMap<>();
        LESSON_01.put(1, hashMapGenerator(HEADER_LEVEL_1, "තොරතුරු වල මුලික තෑනුම් ඒකක හා එහි ගති ලක්ෂණ (Basic Building Blocks of Information)"));

        LESSON_01.put(2, hashMapGenerator(HEADER_LEVEL_2, "දත්ත – හැදින්වීම (Introduction to Data)"));
        LESSON_01.put(3, hashMapGenerator(DESCRIPTION, "ලංකාවේ හැම වසර 10 කටම වරක්ම පවත්වන ජන සංගණනය සලකමු . සැම නිවසකටම පැමිණෙන ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමේන්තුවේ නියෝජිතයේක් ගෘහ මුලිකයාගෙ නම,ගෙදර කොපමණ සාමාජිකයෝ ඉන්නවද, ඒ අයගෙ නම් ,වයස ,ස්ත්\u200Dරි පුර්ෂ භාවය ආදී විශාල කරුණු ප්\u200Dරමාණයක්(facts) ,ස්ථිර පදිංචිය තහවුරු කරගෙන , සටහන් කර ගනී.ගෙදරට ලබාදී ඇති සංගනණ අංකයට මෙහි සුවිශේෂී ස්ථානයක් හිමි වී තිබෙනු දැකිය හැක .2011 ජන හා නිවාස සංගණනය භාවිතා කල පහත පත්\u200Dරිකව සහ එහි අවශ්\u200Dය කර ඇති කරුණු වෙත අවදානය යොමු කරන්න."));
        LESSON_01.put(4, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson1_img_1)));
        LESSON_01.put(5, hashMapGenerator(DESCRIPTION, "මෙලෙස ලංකාවේ සැම ගෘහයකින්ම එකතු කරගත් පත්\u200Dරිකා,සුවිශේෂ ක්\u200Dරියාවලියකින් පසු ,ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමෙන්තුව පහත දක්වෙන කෙටි වගු වලට පරිවර්තනය කරයි.මෙය ඉහත කරුණු එක් ස්වරුපයක(facts) සිටවෙනත් ස්වරුපයකට පරිවර්තනයක් ලෙස සැලකිය හැක."));
        LESSON_01.put(6, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson1_img_2)));
        LESSON_01.put(7, hashMapGenerator(DESCRIPTION, "කුඩා අවදියේ පටන්කරුණු සංශිප්තව දැක්වීමට අප වගු සටහන් භාවිතා කරයි. ඉහත සංශිප්තව දක්වා ඇති ,මධය වාර්ෂික ජනගහනය,ජන ඝනත්වය,වාර්ෂික උපත් මරණ අනුපතය ආදිය උපුටගෙන නොයෙකුත් සැසදිම් ,ව්ශ්ලේෂ හා නිගමන ඉදිරිපත් කරන අතර මෙය ඉදිරි කටයුතු පිබුරුපත් කිරීමටත් ඉතාම වැදගත්.මෙහිදී එළබෙන නිගමන වඩාත් සංශිප්ත වන අතර නව සවරුපයක වඩාත් වැදගත් කරුණකි. ( උදා : එක් ,එක් දිස්ත්\u200Dරිකයකින් පාර්ලිමේන්තුවේ නියෝගනය කරන අසුන් ගණන වෙනස්  කිරීම)"));
        LESSON_01.put(8, hashMapGenerator(DESCRIPTION, "පත්\u200Dරිකාව  නිවැරදිව සම්පූර්ණ කල විට ,මෙය කියවන ඔබ ඇතුළු ඔබේ පවුලේ සාමාජිකයින් මධය වාර්ෂික ජනගහනයට දායකවී ඇති බව  පැහැදිලි වේ .නමුත් ,පවුලේ සාමාජිකයින් ගණන පමණක් රටේ මුළු ගනගාහනය සාපේක්ෂව  සැලකු විට, පරිපාලකයන්ට නොසැලකිය හැකි තරම් කුඩා නොවැදගත් අගයකි."));
        LESSON_01.put(9, hashMapGenerator(DESCRIPTION, "එනමුත් ගෙදර කොපමන් සංඛ්\u200Dයාවක් ඉන්නවද යන්න නිගමන, තිරණ ගන්න වැදගත්වන අවස්ථා නැතුවාක් නොවේ.උදාහරණයක් වශයෙන් ඔබගේ මව ආහාර පිසීමට පෙර ගෙදර එදින කොපමණ සංඛ්\u200Dයාවක් සිටීද යන්න විමසා බලන අවස්ථාව සලකන්න."));
        LESSON_01.put(10, hashMapGenerator(DESCRIPTION, "තොරතුරු හා සන්නිවේදන තාක්ෂණයට අත්පොත් තබන නංගිලා මල්ලිලාට පහත දැක්වෙන කරුණු මිට ඉහතදී සමහර අවස්ථා වල ගැටළුවක් වන්නට ඇත.හේතුව මේ වන විට අවබෝධ කරගෙන සිටීමටත් පුලුවන් ."));
        LESSON_01.put(11, hashMapGenerator(DESCRIPTION_LIST, "╬ එක් රැස් කරගත් පත්\u200Dරිකා කිසිදු වෙනසකට භාවිතා නොකර ,ලංකාව ගැන ව්ශ්ලේෂ හා නිගමන කිරීමට හැකිද?"));
        LESSON_01.put(12, hashMapGenerator(DESCRIPTION_LIST, "╬ නිවාස දෙකක් පමණක් සැසදීමට ,කොට්ඨාශ දෙකක් පමණක් සැසදීමට, ඉහත සංශිප්ත වගුව සුදුසුද ? (වටහ ගන්න පුලුවන්)"));
        LESSON_01.put(13, hashMapGenerator(DESCRIPTION_LIST, "╬ පත්\u200Dරිකවල අඩංගු කරුණු වෙනත් ස්වරුපයකට පත් කලවිට , වෙනත් පාර්ශවයක් එයට ඉහල වටිනාකමක් ලබාදෙන්නේ ඇයි?"));
        LESSON_01.put(14, hashMapGenerator(DESCRIPTION_LIST, "╬ එක පුද්ගලයකුට වැදගත් වන පත්\u200Dරිකාවක් හෝ පත්\u200Dරිකා තවත් පුද්ගලයකුට ඒ හා සමානව වැදගත් නොවන්නේ ඇයි?"));
        LESSON_01.put(15, hashMapGenerator(DESCRIPTION, "හේතුව තමයි දත්ත වල බහුමාධ්\u200Dය ආකාරයෙන් පැවතීම"));

        LESSON_01.put(16, hashMapGenerator(HEADER_LEVEL_2, "දත්තවල නිර්වචනය(Data Definition)"));
        LESSON_01.put(17, hashMapGenerator(HEADER_LEVEL_3, "අර්ථ රහිත (Meaningless)"));
        LESSON_01.put(18, hashMapGenerator(DESCRIPTION, "අර්ථ රහිත ( අර්ථ විරහිත ) කියලා කියන්නේ දත්ත දැනට පවතින ආකාරයෙන් භාවිතා කරන්නාගේ අරමුණ සම්පුර්න කරගන්න බැරි නිසා .ඒ කියන්නේ පවතින අර්ථ විරහිත ආකාරයේ සිට අර්ථාන්විත ආකාරයකට පත් කරන්න ඕනේ. ජන සංගණනයේ  සැසදිම් ,ව්ශ්ලේෂ හා නිගමන ඉදිරිපත් කරන අයට ගෙවල් වලින් එකතු කරපු පත්\u200Dරිකා වලින් කෙලිම නිගමන වලට පැමිණීම ප්\u200Dරයෝගික නැහැ. එවැනි විශ්ලේෂණයක් පිළිගැනීමට ලක්වෙන්නේ නැත්තේ යොදාගත් දත්ත අර්ථාන්විත ආකාරයකට( සංශිප්ත ,වගුගත , ලංකාවේම කරුණු ඇතුලත් ) අකාරයට පත්කර නැති නිසා. විශ්ලේෂකයන්ට අනුව පත්\u200Dරිකා වල අඩංගු වෙන්න දත්ත ලෙස සැලකිය හැකියි."));
        LESSON_01.put(19, hashMapGenerator(HEADER_LEVEL_3, "අසංවිධි (Not organized)"));
        LESSON_01.put(20, hashMapGenerator(DESCRIPTION, "සැම පත්\u200Dරිකාවකම එම නිවසේ කරුණු බොහොමයක් අඩංගුයි. එක එක පත්\u200Dරිකාව අරන් කියන්න හැකි වෙන්නේ ඒ ඒ නිවසේ විස්තර විතරයි. ලකාවේ තොරතුරක් ලබා ගන්න තවදුරත් දත්ත සවිධානය කල යුතුයි .  ලංකාවේ ඉන්න පුද්ගලෙක් ගේ නම,  ජාතික හැදුනුම්පත් අංකය දන්නවානම් තහවුරු කරගන්න  ,මේ හැම පත්\u200Dරිකාවකම නිවැසියන්ගේ  නම හෝ ජාතික හැදුනුම්පත් අංකයට (NIC) සමඟ සටහන් කරගන්න වෙනවා. උදාහරණයක \u200Cලංකාවේ ඉන්නේ හැමෝගෙ නම සමග වයස දන්නවා නම්, ඔබගේ වයසේ කි දෙනෙක් ඉන්නවාද ඇසුවොත්, අපිට ඒ දත්ත අවම වශයෙන් කණ්ඩායම් දෙකකට බෙදාගන්නවත් වෙනවා.ඊට පස්සේ අපේ වයසට සමාන කණ්ඩායමේ කි දෙනෙක් ඉන්නවද කියලා ගනින්න (count) ඕනේ .දත්ත සංවිධානය කරන්න බහුලව සංඛ්\u200Dයානය (Statistics) භාවිතා කරන්න පුළුවන් කියලා දැන් ඔය ගොල්ලන්ට තේරෙනවා ඇති ."));
        LESSON_01.put(21, hashMapGenerator(HEADER_LEVEL_3, "අවිධිමත් – ( Informal )"));
        LESSON_01.put(22, hashMapGenerator(DESCRIPTION, "දත්ත පිහිටන ආකාරය අනුව භාවිතා කරන්නා අවිධිමත් ලෙස වර්ග කරන්න පුළුවන් . දත්ත එක්රැස් කිරීමේදී මූලික අර්ථයෙන් ලබාගන්නා(source format) දත්ත අසම්පුරන වෙන්න පලුවන්. උදාහරණයට හැටියට සමහර වයසක අයගේ ජාතික හැදුනුම්පත් ලබාගන්න බැරි වෙන්න පලුවන්.එවැනි අවස්ථාවක පත්\u200Dරිකාවේ  අනිවාර්ය දත්ත පවා මගහැරී තියෙන්න පුළුවන්. ජනලේඛන හා සංඛ්\u200Dයාලේඛන දෙපාර්තමේන්තුව ඉහත ආකාරයේ සම්මතව පත්\u200Dරිකාවක් නිදේශ කර නොතිබුනානම් , නියෝජිතයන් විවිධ පත්\u200Dරිකා සකස්කර ( විවිධ පිලිවල , විවිධ හදුන්වන නාම ) ලබාදෙන්නේ පලුවන්. එවිට පත්\u200Dරිකාවල අවිධිමත් බව වැඩි වෙනවා."));

        LESSON_01.put(23, hashMapGenerator(HEADER_LEVEL_2, "දත්ත පිහිටන ආකාර -( Types of Data Forms )"));
        LESSON_01.put(24, hashMapGenerator(DESCRIPTION, "දත්ත එක්රැස් කරන කොට ඒවා ප්\u200Dරදාන වශයෙන් ආකාර 3 කට පවතිනවා."));
        LESSON_01.put(25, hashMapGenerator(HEADER_LEVEL_3, "╬ ලිඛිත සටහන් (Text )"));
        LESSON_01.put(26, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson1_img_3)));
        LESSON_01.put(27, hashMapGenerator(DESCRIPTION, "දත්ත රස කරන ප්\u200Dරධාන මාධ්\u200Dයක් වෙන්නේ ලිඛිත සටහන්. ලියන්න හැකි ඕනෑම කෙනෙකුට, දත්ත කොලයක හෝ ජංගම දුරකථනයක සටහන් කර ගන්න පලුවන්. පුද්ගලයෙකුට එදිනෙදා වැදගත් වෙන ,දුරකථන අංක ,ගමන් කළ ස්ථාන, ස්ථාන අතර දුර , බැංකු ගිණුම් අංක සහ තවත් බොහෝ දේවල් ලිඛිත දත්ත ලෙස සලකන්න පලුවන්.තේරුම් ගත නොහැකි අපිළිවෙල සංකේත කිහිපයක් රහස් භාෂාවක දත්තයක් වෙන්න පලුවන්."));
        LESSON_01.put(28, hashMapGenerator(DESCRIPTION, "දත්ත එකතු කිරීම ගවේෂනයෙන් (observation ) හෝ ප්\u200Dරශ්න ඇසීමෙන් (questioning ) හෝ දත්ත එක්රැස් කරන විශේෂ උපකරණයක සටහන් කර ගන්න පලුවන්.උදාහරනයක් විදියට කොනමනය ,උනකටුව ගන්න පලුවන්. පරිගණකය සොයා පෙර දත්ත කළමනාකරණය කිරීමට file system භාවිතා කලා. එවැන්නක් මුලාශ දත්ත සකස්කර ,ගොණුකර තැබුවෙත ලිඛිත සටහන් ලෙසින්. ලිඛිත සටහන් පසුව කායික ක්\u200Dරම (manual) හෝ ප්\u200Dරකාශ සලකුණු කියවනය (OMR) ,ප්\u200Dරකාශ අනුලක්\u200Dෂණ කියවනය (OCR) ආදී ස්වයංක්\u200Dරිය ක්\u200Dරම මගින් පරිගණකයට feed කරන්න පලුවන්."));
        LESSON_01.put(29, hashMapGenerator(HEADER_LEVEL_3, "╬ ශ්\u200Dරව්\u200Dය (Audio ) "));
        LESSON_01.put(30, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson1_img_3)));
        LESSON_01.put(31, hashMapGenerator(DESCRIPTION, "කම්පන අකාරයට ඇති සන්තතික (continuous) ශබ්ද තරංග microphone දියුණුවත් සමග විද්\u200Dයුත් තරංගයක් (electric signal ) බවට පරිවර්තනය (convert) කිරීමට හැකි උනා.පරිගණක තාක්ෂණයේ සහ සන්නිවේදන තාක්ෂණයේ දියුණුවත් සමගම මෙම electric signal එක පරිගණකයට තේරුම් ගතහැකි ද්විමය (Binary) විද්\u200Dයුත් තරංගයක් බවට පරිවර්තනය කර feed කිරීමට දැන් පුළුවන්. මෙම ක්\u200Dරියාවලිය විස්තරාත්මකව 8. දත්ත හා සන්නිවේදනය පාඩමේදී දැනගන්න පලුවන්. මෙහිදී විවිධ microphone අවශ්\u200Dයතාව අනුව යොදාගන්නවා.උදාහරන ලෙස සංගීතඥයා vocal recoding microphone එකක් බාවිතා කරන අතර රහස් පරීක්ෂක කටයුතු සදහා සංවේදී කුඩා microphone භාවිතා වෙනවා .ශබ්ද තරංග පරිගණකය feed කිරීමෙන් මූලික වශයෙන් ශබ්ද තරංග ලෙස ප්\u200Dරතිදානය ලබාගැනීමත් , සැකසීමත් (උදාහරනයක් ලෙස ඝෝෂාව ඉවත් කිරීම ) බලාපොරත්තු වෙනවා ."));
        LESSON_01.put(32, hashMapGenerator(HEADER_LEVEL_3, "╬ දෘශ\u200Dය(Video)"));
        LESSON_01.put(33, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson1_img_5)));
        LESSON_01.put(34, hashMapGenerator(DESCRIPTION, "ශබ්ද තරංග පරිගණකයට සාර්ථකව feed කිරීමත් සමගම දෘශ්\u200Dය මාධ්\u200Dයයෙන් දත්ත ඇතුලත් කිරීමත් හැකි උනා . මෙහිදී ප්\u200Dරදාන වශයෙන් Digital Camera බාවිතයට ගන්නවා. Digital Camera තුල දත්ත ගබඩා කරන්නේ ද්විමය (Binary) විද්\u200Dයුත් තරංග ආකාරයටමය.සැබවින්ම මෙහිදී වීඩියෝ වක් ,අනුපිලිවලකට ඇති නිශ්චල ඦායාරූප වල එකතුවක් ලෙස සලකන්න පලුවන්. පරිගණකයට තේරුම් ගතහැකි ද්විමය (Binary) මාධ්\u200Dයට පරිවතනයේදී මෙම නිශ්චල  ඦායාරූප ඉතා කුඩා කොටු (pixel) වලට වෙන් කිරීම හෝ දෛශික ගණිතමය සමීකරණ අකාරයට පත් කරනවා. සරළ වෙබ් camera සිට Augmented Reality තාක්ෂණයේදී බාවිතා වෙන අධි සංවේදී සංවේදක (sensors) දක්වා මෙම Digital Camera විකාශය වෙලා තියෙනවා ."));
        LESSON_01.put(35, hashMapGenerator(DESCRIPTION, "දත්ත “අවිධිමත් අර්ථ රහිත අසංවිධිත අංග සමුහයක් ” ලෙස නිර්වචනය කර හැකියි.සරල ලෙස මූලික අර්ථයෙන් ලබාදෙන (source format) සකස්කිරිමකට භාජනය නොකළ කරුණු (facts) ,සංඛ්\u200Dයා (numbers) , රූප (images) සහ මිනුම් (measures)සැලකිය හැක . දත්ත ප්\u200Dරධාන වශයෙන් ,ලිඛිත (Text),ශ්\u200Dරව්\u200Dය (Audio ), දෘශ\u200Dය(Video) මෙන්ම ,ප්\u200Dරමාණාත්මක(qualitative) හා ගුණාත්මක ලෙසත් වර්ගකල දැක්විය හැක."));
        LESSON_01.put(36, hashMapGenerator(DESCRIPTION, "අප අවට පරිසරයේ සුවිශාල දත්ත සමභාරයෙන් පවතින අතරම නිර්මාණය ද වේ .(උදා: කාළගුණික වෙනස් වීම් වලට අදාල දත්ත). නමුත්, නුතන මිනිසා එම දත්ත වලින් සාර්ථක ලෙස තොරතුරු උකහා ගනීද යන්න සැකසහිතය .එසේ වුවත් ,මේරු ,කුහුබුවන් ,කවුඩන් ආදී විවිධ සතුන්ගේ විවිධ හැසිරීම රටා නිරීක්ෂණය කරන ලද පැරැන්නෝ ,පාරිසරික වෙනස් වීම් ,කාලගුණික වෙනස් වීම් ගැන කල්තියා නිගමනය කර, සුදුසු ක්\u200Dරියාමාර්ග වලට එලබිමටත් අතිශය සමර්තයෝ විය. වර්තමානයේ කලබලකාරී ජීවන රටාව තුල , අපි දත්ත ලෙස සැලකිය හැකි සතුන්ගේ විවිධ ක්\u200Dරියාකාරකම් කොතෙකුත් දුටුවත් ,එමගින් වැදගත් තොරතුරක් උකහා ගැනීමට සැලකිලිමත් වන්නේ ,ඉතාමත් අවම වශයෙන්. 2004 වර්ෂයේදී ශ්\u200Dරී ලංකාවට බලපෑ සුනාමි අවස්ථාවේදී සතුන්ගේ හැසිරීම මෙයට එක් උදාහරණයක් පමණි."));
        LESSON_01.put(37, hashMapGenerator(DESCRIPTION, "පරිගණකයේ සුවිශේෂී දියුණුවත් සමගම දත්ත උකහා ගැනීම හා තොරතුරැ බවට සැකසීම කාර්යක්ෂම වු අතරම , අන්තර්ජාලයේ(Internet) හා විශ්ව විසිරි වියමන(World Wide Web) අති විශාල දත්ත ප්\u200Dරමානයක් දෛනිකව නිර්මාණය කරමින් පවතී . විශ්ව විසිරි වියමනේ පවතින විවිධ වෙබ් අඩවි හා විවිධ සමාජ ජාල තුල භාවිතා කරන්නන් එහි සිදු කරන ක්\u200Dරියාකාරකම් මෙයට මුලික වශයෙන් පාදක වේ .තොරතුරැ තාක්ෂණයේ දියුණුවත් සමගම ,වෙළඳ සමාගම් මෙලෙස එක්රැස් වන දත්ත, නව අවශ්\u200Dයතා හදුනා ගැනීමට , නව නිෂ්පාදන හදුන්වාදීමට ,අත්හදාබැලීමට ,තරගකරුවන් සුවිශේෂිතා හා දුර්වලතා හදුනාගැනීමට යොදාගනී.මෙලෙස එකරැස් කල තොරතුරු හෝ සංක්ෂිප්ත දත්ත ,අලෙවිකරණ විශේෂඥයන්ටඉතාමත් වැදගත් වන අතර අර්ථකථනය (interpret ) මගින් වඩාත් වැදගත් තොරතුරු විවරණය කර ගත හැක."));
        LESSON_01.put(38, hashMapGenerator(DESCRIPTION, "තොරතුරු තාක්ෂණයට අත්පොත් තබන්නෙක් ලෙස මෙහිදී අවධාරනය කරගත යුත් කාරණාවක් වන්නේ , තොරතුරක ස්වභාවය, ප්\u200Dරොයෝජනවත් බව හා අර්ථ දක්වන ආකාරය, එය අවශ්\u200Dය කරන්නාගේ හෝ භාවිතා කරන්නා මත රඳාපවතින බවයි .මේ අවබෝධයත් සමග අප තොරතුරක අර්ථ දැක්වීම වෙත යොමු වෙමු. අදාල පුද්ගලයකුට අර්ථවත් වන සේ සකස් කරන ලද දත්ත තොරතුරු නම් වේ."));

        LESSON_01.put(39, hashMapGenerator(HEADER_LEVEL_2, "තොරතුරු වල ගති ලක්ෂණ(Characteristics of Information)"));
        LESSON_01.put(40, hashMapGenerator(HEADER_LEVEL_3, "╬ අර්ථවත් වේ"));
        LESSON_01.put(41, hashMapGenerator(DESCRIPTION_LIST, "තොරතුරක් දත්තයකින් වෙනස් වන ප්\u200Dරධාන සාධකය එය අදාල පාර්ශවය අර්ථ දක්වා වෙනත් තොරතුරක් හෝ දැනුම උකහා ගත හැකි වීමයි. උදාහරණයක් ලෙස රෝගියකුට රෝග ලක්ෂණ (facts ,data) මත පදනම්ව තමන් විසින්ම රෝග වින්ශ්වය කර නිගමනයකට එලබීමට අනුමත නොකරයි. සුදුසු වෛද්\u200Dයවරෙක් මෙම ලක්ෂණ මගින් වලදී ඇත රෝගය පිළිබද කිසියම් නිගමනයකට (information) එලබීමට හැකියාව ඇත. "));
        LESSON_01.put(42, hashMapGenerator(HEADER_LEVEL_3, "╬ පෙර දැනුම නවීකරනය කරයි"));
        LESSON_01.put(43, hashMapGenerator(DESCRIPTION_LIST, "කුඩා අවදියේ පටන් විවිධ දේ ප්\u200Dරගුණ කිරීමෙන් නිර්මාණය වන හැකියාව හා විධිමත අධ්\u200Dයාපනයකදී විවිධ න්\u200Dයායත්මක කරුණු අර්ථ ගැන්වීමේදී ලබන අවබෝධය දැනුමට මුලික අඩිතාලම සපයයි.නමුත් අප දෛනිකව පරිසරයෙන් උකහාගන්නා තොරතුරු මගින් ,යමක් පිළිබද අවබෝධය ,අරුත්ගන්විම වෙනස් කරන අතර එය අපගේ දැනුම නවීකරණය "));
        LESSON_01.put(44, hashMapGenerator(HEADER_LEVEL_3, "╬ අන්තර් සන්නිවේදන මාධ්\u200Dයකි."));
        LESSON_01.put(45, hashMapGenerator(DESCRIPTION_LIST, "අරුත්ගන්වා වඩාත් සුදුසු තීරණ ගැනීමට දත්ත රාශියකට සාපේක්ෂව තොරතුරු ස්ථිර වශයෙන් මග පාදයි. "));
        LESSON_01.put(46, hashMapGenerator(HEADER_LEVEL_3, "╬ කාලින වන අතර තීරණ ගැනීමට උපකාරී වේ"));
        LESSON_01.put(47, hashMapGenerator(DESCRIPTION_LIST, "කිසියම් වස්තුවකට අදාළ කරුණු (facts)බොහෝ දුරට නොවෙස් වන නමුත් අප උකහා ගන්න හෝ වෙනත් මර්ගයන් මගින් ලැබෙන තොරතුර කාලීනව වෙනස් වීමට බොහෝ දුරට අවස්ථාව ඇත. උදාහරණයක් ලෙස ඔබ දිගුකාලින භාණ්ඩයක් මිලදී ගැනීමේදී එම භාණ්ඩය නිරීක්ෂණය කර ලබා ගන්න කරුණු වලට පමණක් සිමා නොවේ.මිට ඉහතදී භාවිතා කල මිතුරන්ගෙන් ඇසීම ,ගුණදොස් විවේචනය (product review) පිරික්සිම ආදී විවිධ තොරතුරු සෙවීම් වලට යොමු වන්නේ වඩාත් සුදුසු තීරණයකට එලබිමටයි. "));
        return LESSON_01;
    }

    /**
     * Get the lesson 02 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson02() {
        LESSON_02 = new LinkedHashMap<>();
        LESSON_02.put(1, hashMapGenerator(HEADER_LEVEL_1, "දත්ත හා තොරතුරු නිර්මාණය, බෙදාහැරීම සහ කළමනාකරණය සඳහා තාක්ෂණයේ අවශ්\u200Dයතාව (The need of technology to create, disseminate and manage data and information) "));
        LESSON_02.put(2, hashMapGenerator(HEADER_LEVEL_2, "දත්ත – හැදින්වීම (Introduction to Data)"));
        LESSON_02.put(3, hashMapGenerator(DESCRIPTION, "සම්ප්\u200Dරදායික ක්\u200Dරම භාවිතයෙන් දත්ත හා තොරතුරු මහා පරිමාණයෙන් සංචලනය වන විට සිදු වන පසුබැසීම පසුගිය පාඩමේදී දත්ත සහ තොරතුරු ගැන අවබෝධයක් අප ලබාගත්තෙමු. එසේම දත්ත සහ තොරතුරු හසුරුවන ආකාරය , දත්ත සහ තොරතුරු වල ගති ලක්ෂණත් අධ්\u200Dයනය කල බැවින් ඒවා පිලිබඳ අවබෝධයක් ඇතියි සිතමි."));
        LESSON_02.put(4, hashMapGenerator(DESCRIPTION, "දත්ත එක්රැස් කිරීමේ දී විවිධ දුෂ්කරතා වලට මුහුණ පෑමට සිදුවේ. සම්ප්\u200Dරදායික ක්\u200Dරමයේ දී දත්ත රැස් කරන විට අඩුපාඩු රැසක් ඇතිවේ. ප්\u200Dරධාන ම කරුණු ලෙස මන්දගාමී බව (Slowness), විශ්වසනීයත්වයෙන් තොර වීම (Unreliability), සහ නිවැරදි නොවීම (Inaccuracy) දැක්විය හැකිය."));
        LESSON_02.put(5, hashMapGenerator(DESCRIPTION, "මේ සඳහා හොඳම උදාහරණය ලෙස අපේ රටේ පවත්වන ජන සංගණනය යොදා ගතහැකිය. සාමාන්\u200Dයයෙන් එය සම්ප්\u200Dරදායික ආකාරයට ක්\u200Dරියාත්මක වේ. මේ සඳහා මාස කිහිපයක් ගතවේ. ඒ අනුව එහි මන්දගාමී බව තිබේ. ඒසේම මාස කිහිපයක් ගත වෙන බැවින් ප්\u200Dරතිඵල නිකුත් කරන විට ඒ ඒ නිවාස වල සිටින අය වෙනස් විය හැකිය.පරස්පරතා දැකිය හැක. ඒසේම විශ්වසනීයත්වයෙන් තොර වීමත් එම ක්\u200Dරමයේදී දක්නට ඇත."));
        LESSON_02.put(6, hashMapGenerator(DESCRIPTION, "ලංකාවේදී මෙය දත්ත සකස් කරන උපකරන අවම වශයෙන් භාවිතා කර මිනිස් ශ්\u200Dරමය භාවිතයෙන් සිදු කරයි. මේ නිසා ජන සංගණන යනු බැරෑරුම් කාර්යකි. දත්ත සැකසීම සිදුවන්නේ ,සෑම නිවසකටම ගොස් තොරතුරු ලියා ගත් පත්\u200Dරිකා නැවත පරිගණක වලට ඇතුළත් කිරීමෙන් පසුවය. එකවර ම පරිගණකයට ගැනීමට හැකි වුයේ නම් ගත වන පිරිවැය මෙන්ම කාලයද ඉතුරුවේ. එබැවින් මෙසේ ලබා ගන්නේ වැඩි පිරිවැයක් දරා නිවැරදි බවත් අඩු තොරතුරු නම් , මේ ක්\u200Dරමය එතරම් සාර්ථක නොවන බව ඔබට වැටහේ."));
        LESSON_02.put(7, hashMapGenerator(HEADER_LEVEL_2, "තොරතුරු තාක්ෂණයේ නව උදාව (නිර්ගමනය)"));
        LESSON_02.put(8, hashMapGenerator(DESCRIPTION, "සම්ප්\u200Dරදායික ක්\u200Dරම භාවිතා කරද්දී මුහුණ දෙන ගැට\u200Dළු සහ අඩුපාඩු මොනවද කියල අපි දැන ගත්තෙමු. ඉතින් මේ සම්ප්\u200Dරදායික ක්\u200Dරම වලින් ඉවත් වී නිවැරදි ආකාරයෙන් කටයුතු කරන්න පුළුවන් යන්ත්\u200Dරයක් හදන්න බොහෝ දෙනා උනන්දු වුනා. මෙහි අතීතය දහ හත්වන සියවසට දිවයයි. අප දැන් භාවිතා කරන පරිගණකය නිර්මාණය වී ඇත්තේ විවිධ වූ වෙනස්කම් වලට භාජනය වීමෙන් පසුවයි."));
        LESSON_02.put(9, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson2_img_1)));
        LESSON_02.put(10, hashMapGenerator(DESCRIPTION, "පූර්ණ ලෙස ක්\u200Dරමලේඛ ගත කළ හැකි යාන්ත්\u200Dරික පරිගණකයක් සංකල්පය කිරීමේ හා සැලසුම් කිරීමේ ගෞරවය හිමි වෙන්නේ චාල්ස් බැබේජ්ටයි (Charles Babbage). ඔහු 1837 දී ස්වයංක්\u200Dරීය ගණනයේ හා ක්\u200Dරමලේඛ කිරීමේ හැකියාවක් සහිත යන්ත්\u200Dරයක් නිපදවූවා. ඒය දැන් අප පාවිච්චි කරන ඒවාට වඩා වෙනස්ය. ප්\u200Dරමාණයෙන් විශාල වුනා වගේ ම ධාරිතාව සහ වේගයත් සුළු අගයක් පැවතුනි."));
        LESSON_02.put(11, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson2_img_2)));
        LESSON_02.put(12, hashMapGenerator(DESCRIPTION, "මේ විදියට දියුණු වෙද්දී පරිගණකයෙන් ලබාගන්න පුළුවන් දේවල් ගැන මිනිසුන් දැනුවත් වූ අතර බොහෝ දෙනා පරිගණකය දියුණු කිරීමට උත්සුක වීය. ඒසේම වැඩ කටයුතු වලට පරිගණකය යොදා ගන්න උත්සාහ කල අතර ඒ නිසා 1890 දී පැවැත්වූ එක්සත් ජනපද සංගණනයේ දී හර්මන් හොලේරිත් (Herman Hollerith) සැලසුම් කරන ලද පරිගණන කිරීමේ ලැයිස්තු ගත කිරීමේ හා ලේඛන ගත කිරීමේ සමාගම මගින් නිෂ්පාදනය කරන ලද විශාල පරිමාණ ස්වයංක්\u200Dරීය සිදුරු පත් දත්ත සැකසුම් යන්ත්\u200Dර භාවිතා කරපු බව සඳහන් වේ. වර්තමානයේ IBM යනුවෙන් හඳුන්වන්නේ මෙම සමාගමයි."));
        LESSON_02.put(13, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson2_img_3)));
        LESSON_02.put(14, hashMapGenerator(DESCRIPTION, "මේ විදියට ආරම්භ වූ පරිගණක යුගය මේ වන විට ඉතා දියුණු තත්ත්වයකට පත්වී ඇත. මුල් කාලයේ ඉතා විශාල ඉඩ ප්\u200Dරමාණයක් ගත් පරිගණක මේ වන විට අතේ ගෙනයා හැකි තරම් දියුණු වී ඇත. වර්තමානයේ විවිධ ප්\u200Dරමාණයේ හා විවිධ ස්වරුපයෙන් යුක්ත වු පරිගණක දැනුවත්ව හෝ නොදනුවත මිනිසා යොදා ගනි. සාමාන්\u200Dය ජනතාවගේ සිට නාසා වැනි ආයතන පවා විවිධ වූ කටයුතු සඳහා පරිගණක යොදාගනී."));
        LESSON_02.put(15, hashMapGenerator(HEADER_LEVEL_2, "තොරතුරු තාක්ෂණය හා සන්නිවේදන තාක්ෂණයේ සංයුග්මනය "));
        LESSON_02.put(16, hashMapGenerator(DESCRIPTION, "තොරතුරු තාක්ෂණය දියුණුවට ඉතා වැදගත් කාර්යයක්.අන්තර්ජාලය මගින් ඉටු කරයි. අන්තර්ජාලය කියන්නේ ලෝකය පුරා ඇති එකිනෙක හා සම්බන්ධ වූ පරිගණක ජාලයන්ගෙන් සැදුම් ලත් ජාලයයි.මෙය අන්තර්ජාල ප්\u200Dරොටොකෝල කට්ටලය (TCP/IP) මගින් නියාමනය වේ. පරිගණක වලින් වැඩ කර ගෙන යන විට පරිගණක ජාල කිරීමේ අවශ්\u200Dයතාවක් පැන නැගුණි. මන්ද යත් පරිගණකයක තිබෙන දත්ත තවත් පරිගණකයකට ගන්න මෙමගින් පහසු වන බැවින්. ඒ නිසා බොහෝ දෙනා මේ ගැන විවිධ අත්හදා බැලීම් සිදු කල අතර ඒ යටතේ 1960 දී ජේ.සී.ආර්. ලික්ලීඩර් හා රොබට් ඩබ්. ටේලර් නැමති පරිගණක පර්යේෂකයන් අන්තර් ක්\u200Dරියාකාරී ප්\u200Dරශ්නවලට පිළිතුරු සෙවීම සඳහා එකිනෙක හා සබැඳුණු ලෝක ව්\u200Dයාප්ත ජාලයක් යෝජනා කළා. මේ ගැන තවදුරටත් පරීක්ෂණ කර දත්ත පැකට්ටු ලෙස දත්ත හුවමාරු කිරීම (Packet switching) ආරම්භ විය. කලින් සාකච්ඡා කළා සේම බොහෝ දෙනා වෙන් වෙන් වශයෙන් සිදුකල පරීක්ෂණ වල ප්\u200Dරතිපලයක් ලෙස විවිධ ජාලයන් (Networks) බිහි වු අතර ඒ කාලයේ ආරම්භ කල ARPANET ජාලය අන්තර්ජාලයට පදනම්වී ඇත. මේ දත්ත පැකට් ලෙස හුවමාරු වීම නිසා අන්තර්ජාලයට ප්\u200Dරොටොකෝලයක් නිපදවූවා. එය අන්තර්ජාල ප්\u200Dරොටොකෝල කට්ටලය (TCP/IP) ලෙස හඳුන්වනවා. මේලෙස දියුණු වුන අන්තර්ජාලය නිසා විශ්ව ව්\u200Dයාප්ත වියමන (WWW – World Wide Web) ඇති වුනා. ඒ වගේ ම විද්\u200Dයුත් තැපෑල ඇති වුනෙත් අන්තර්ජාලය නිසායි. මේ දේවල් නිසා තොරතුරු තාක්ෂණ ක්ෂේත්\u200Dරයේ පෙරළියක් වූ අතර google,yahoo වගේ සෙවුම් යන්ත්\u200Dර නිසා අන්තර්ජාලය සහ විශ්ව ව්\u200Dයාප්ත වියමනේ දියුණුව තවත් වැඩි විය. අන්තර්ජාලය සහ දුරකථන තාක්ෂණයේ දියුණුවත් සමගම ජංගම දුරකථන නිෂ්පාදනයටත් සමාගම් උත්සාහ කල අතර මේ යටතේ මේ වන විට ජංගම දුරකථන, ලැප්ටොප්, ටැබ් වැනි ජංගම උපාංග නිපදවූවා. මේ නිසා දත්ත පරිශීලනය ඕනෑම ස්ථානයක සිට සිදුකල හැකි වු අතර බොහෝ ක්ෂේත්\u200Dර දියුණු වුනා කිව්වොත් නිවැරදියි. මේ වන විට සන්නිවේදන තාක්ෂණයේ දියුණුව නිසා අන්තර්ජාලය භාවිතය වඩාත් කාර්යක්ෂම වී ඇත. බ්\u200Dරෝඩ්බෑන්ඩ්, වයි-මැක්ස් වැනි තාක්ෂණ මෙන් ම ජංගම උපකරණ සඳහා 3G, 4G, HSDPA වැනි විවිධ වූ තාක්\u200Dෂණයන් භාවිතයට පැමිණ තිබේ. "));
        return LESSON_02;
    }

    /**
     * Get the lesson 03 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson03() {
        LESSON_03 = new LinkedHashMap<>();
        LESSON_03.put(1, hashMapGenerator(HEADER_LEVEL_1, "තොරතුරු වල වියුක්ත ආකෘතිය හා එහි වැදගත්කම(Abstract Model of Information) "));
        LESSON_03.put(2, hashMapGenerator(HEADER_LEVEL_2, "තොරතුරු වල වියුක්ත ආකෘතිය (Abstract Model of Information) "));
        LESSON_03.put(3, hashMapGenerator(DESCRIPTION, "හොඳයි දත්ත හා තොරතුරු ගැන පහුගිය පාඩම් වලින් හොඳ දැනුමක් ලැබුව කියල හිතනව. මම දැන් කතා කරන්න යන්නෙ දත්ත හා තොරතුරු කොහොමද ප්\u200Dරයෝගික ජීවිතේදි ප්\u200Dරයෝජනවත් ලෙස යොදා ගන්නෙ කියලා. "));
        LESSON_03.put(4, hashMapGenerator(DESCRIPTION, "පරිගණක පද්ධතියක් කියන්නෙ දෘඩාංග හා මෘදුකාංග වලින් සමන්විත පද්ධතියක්. නමුත් පරිගණක පද්ධතියක් (Computer System) අපිට වැදගත් වෙන්නෙ අපිට අදාල වෙන දත්ත (Data) ඒකට ඇතුලත් කරලා අපෙන් ලැබෙන උපදෙස් (Instructions) මත යම් ක්\u200Dරියවලියක් එහෙමත් නැත්නම් සැකසුමක් (Process) සිදුවෙලා අපි බලාපොරොත්තු වෙන විදියේ ප්\u200Dරතිදානයක් (Output) ලැබුනොත් විතරයි. "));
        LESSON_03.put(5, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson3_img_1)));
        LESSON_03.put(6, hashMapGenerator(DESCRIPTION, "ඉතින් අපි මේ විදියට දත්ත (data) අතුලත් කලාම අපි ලබා දීල තියෙන උපදෙස් (instructions) අනුව පරිගණක පද්ධතිය ක්\u200Dරියාත්මක වෙලා ඒ දත්ත ප්\u200Dරයෝජනවත්ව යොද ගන්න පුලුවන් විදියට අර්ථවත් සැකසුමකට (process) භාජනය කරනව. ඊට පස්සෙ ඒ සැකසූ දත්ත එහෙමත් නැත්නන් තොරතුරු (information) අපිට ප්\u200Dරයෝජනයට ගන්න පුලුවන් විදියට පරිගණක පද්ධතිය ප්\u200Dරතිදානය (output) කරනවා."));
        LESSON_03.put(7, hashMapGenerator(DESCRIPTION, "පහත රූප වලින් ආදාන හා ප්\u200Dරතිදාන ක්\u200Dරියවලි වලට උපයෝගී වෙන පරිගණක පද්ධතියක තියෙන උපාංග ගැන අදහසක් ඔයාලට ලැබෙයි."));
        LESSON_03.put(8, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson3_img_2)));
        LESSON_03.put(9, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson3_img_3)));
        LESSON_03.put(10, hashMapGenerator(DESCRIPTION, "මේ ක්\u200Dරියාවලියට සරල උදාහරණයක් කියනව නම් රෙදි සේදුම් යන්ත්\u200Dරයේ (a computer system) ක්\u200Dරියාවලිය ගන්න පුලුවන්. රෙදි හෝදන කොට මුලින්ම අපි රෙදි සේදුම් යන්ත්\u200Dරයට කිලි\u200Dටු ඇඳුම්, වතුර, සබන් කුඩු (input) ඇතුලත් කරනව. ඊට පස්සෙ රෙදි සේදුම් යන්ත්\u200Dරය අපි ලබා දෙන උපදෙස් (instructions) අනුව ඇඳුම් ටික වතුරයි සබන් කුඩුයි යොදාගෙන සේදුම් ක්\u200Dරියාවලියකට (process) භාජනය කරල පිරිසිදු ඇඳුම් (output) ටික අපිට ලබා දෙනව. ඉතින් මෙන්න මේ විදියට තමයි හැම පරිගණක පද්ධතියකම දත්ත සැකසුම් ක්\u200Dරියාවලිය සිදුවෙන්නෙ."));
        LESSON_03.put(11, hashMapGenerator(DESCRIPTION, "ඉතින් ඕගොල්ලන්ට හිතෙන්න පුලුවන් ඇයි අපිම දත්ත සකසගන් නැතුව බුද්ධියක් නැති පරිගණක පද්ධතියකට දත්ත ඇතුලත් කරල අපේ උපදෙස් වලින්ම දත්ත සකසගන්නෙ කියල. ඒකට එකම හේතුව තමයි සැකසුම් වේගය (processing speed). අද වෙනකොට පරිගණක පද්ධතියක සැකසුම් වේගය ගිගා හර්ට්ස් (GHz) වලින් සිදුවෙන්නෙ. තේරෙන විදියට කියනවනන් එක තත්පරයක් අතුලත දැන් තියන පරිගණක වලට දත්ත ඇතුලත් උපදෙස් 109කට වැඩි ප්\u200Dරමාණයක් සැකසුම් කරන්න පුලුවන්. නමුත් අපිට එච්චර වේගයකින් ඒ වැඩේ කරන්න බෑ."));
        return LESSON_03;
    }

    /**
     * Get the lesson 04 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson04() {
        LESSON_04 = new LinkedHashMap<>();
        LESSON_04.put(1, hashMapGenerator(HEADER_LEVEL_1, "පරිගණක පද්ධතියක මූලික සංරචක (Basic Components of the Computer System)"));
        LESSON_04.put(2, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson4_img_1)));
        LESSON_04.put(3, hashMapGenerator(DESCRIPTION, "පරිගණක පද්ධතියක් සැලකීමේදී එහි මූලික සංරචක 4ක් හඳුනා ගත හැකි වේ. එවා නම්,"));
        LESSON_04.put(4, hashMapGenerator(HEADER_LEVEL_2, "දෘඩාංග (Hardware)"));
        LESSON_04.put(5, hashMapGenerator(DESCRIPTION_LIST, "පරිගණක පද්දතියක භෞතික කොටස් දෘඩාංග ලෙස හැදින්වේ."));
        LESSON_04.put(6, hashMapGenerator(HEADER_LEVEL_2, "මෘදුකාංග (Software)"));
        LESSON_04.put(7, hashMapGenerator(DESCRIPTION_LIST, "පරිගණක පද්දතියකට යම් කාර්යයක් සිදු කිරීම සඳහා අවශ්\u200Dය වන උපදෙස් මාලාවක් මෘදුකාංගයක් ලෙස හැදින්වේ."));
        LESSON_04.put(8, hashMapGenerator(HEADER_LEVEL_2, "ස්ථීරාංග (Firmware)"));
        LESSON_04.put(9, hashMapGenerator(DESCRIPTION_LIST, "පසුකාලීනව වෙනස් කළ නොහැකි නමුත් කියවීමට පමණක් හැකිවන ලෙස පරිගණක දෘඩාංග තුළ තැනපත් කරන ක්\u200Dරමලේඛ වේ. මේවා පරිගණකයේ සමාරම්භය සඳහා අවශ්\u200Dය වේ."));
        LESSON_04.put(10, hashMapGenerator(HEADER_LEVEL_2, "ජීවාංග (Liveware)"));
        LESSON_04.put(11, hashMapGenerator(DESCRIPTION_LIST, "යම් අවස්ථාවකදී පරිගණකය පරිශීලනය කරන පුද්ගලයා එම අවස්ථාවේදී එම පරිගණක පද්ධතියේ ජීවාංගය ලෙස හැදින්වේ."));
        LESSON_04.put(12, hashMapGenerator(DESCRIPTION, "සටහන: දත්ත හා තොරතුරු පරිගණක පද්ධතියට අයත් නොවන අතර පරිගණක පද්ධතියට දත්ත ලබා දී තොරතුරු බවට පරිවර්තනය කර ගනී. "));
        return LESSON_04;
    }

    /**
     * Get the lesson 05 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson05() {

        LESSON_05 = new LinkedHashMap<>();
        LESSON_05.put(1, hashMapGenerator(HEADER_LEVEL_1, "දත්ත සැකසුම් ජීවන චක්\u200Dරය (Data Processing Life Cycle)"));
        LESSON_05.put(2, hashMapGenerator(DESCRIPTION, "දත්ත සැකසුම් ජීවන චක්\u200Dරය (Data Processing Life Cycle)"));
        LESSON_05.put(3, hashMapGenerator(HEADER_LEVEL_2, "දත්ත එක් රැස් කිරීමේ ක්\u200Dරම (Data Collection Methods"));
        LESSON_05.put(4, hashMapGenerator(DESCRIPTION, "කායික ක්\u200Dරම සහ ස්වයංක්\u200Dරීය ක්\u200Dරම කියලා දත්ත එක් රැස් කිරීමේ ප්\u200Dරධාන ක්\u200Dරම 2ක් තියෙනවා.අපි දැන් බලමු දත්ත එක් රැස් කිරීමේ කායික ක්\u200Dරම මොනවද කියලා.කායික ක්\u200Dරම කියන්නෙ මිනිසුන්ගේ මැදිහත් වීමෙන් දත්ත එක් රැස් කිරීමටයි."));
        LESSON_05.put(5, hashMapGenerator(DESCRIPTION, "සම්මුඛ පරීක්ෂණ, විමර්ශන සහ ප්\u200Dරශ්නාවලීන් කියන්නේ ඒ වගේ දත්ත එක් රැස් කරන විඳි කීපයක්.සම්මුඛ පරීක්ෂණ කියන්නෙ අපි කවුරුත් දන්න විදියට පුද්ගලයින් එක් අයෙකුට වඩා කරන සාකච්ඡාවක්.එවැනි සාකච්ඡාවලින් දත්ත එක් රැස් කර ගන්න පුළුවන්.ප්\u200Dරශ්නාවලින් වලින් දත්ත රැස් කිරීමෙදී කලින් සැකසූ ප්\u200Dරශ්නගොනුවකට උත්තර ලබා ගන්නවා. විශ්ලේශන වලින් ලැබෙන ප්\u200Dරථිපල මේ එක් රැස් කිරීමට අයත් වෙනවා."));
        LESSON_05.put(6, hashMapGenerator(DESCRIPTION, "හැබැයි මේ ක්\u200Dරමයේදී දත්ත ලබාගැනීමේ අපහසුතා, විශ්ලේෂණය කිරීමේ අපහසුතා, මුද්\u200Dරණ දෝෂ, අධික වියදම් සිදුවීම වගේ ගැටලු ඇතිවෙන්න පුළුවන්. දත්ත එක් රැස් කිරීමේ ස්වයංක්\u200Dරීය ක්\u200Dරම කියන්නෙ ප්\u200Dරකාශ සලකුනු කියවනය(OMR), ප්\u200Dරකාශ අනුලක්ෂණ කියවනය(OCR), චුම්භකිත තීන්ත අනුලක්ෂණ කියවනය(MICR), කාඩ්පත්,පටි, ලාංඡන වැනි මාර්ග වලින් දත්ත එක් රැස් කිරීමටයි."));
        return LESSON_05;
    }

    /**
     * Get the lesson 06 details as a HashMap object
     *
     * @return {@link LinkedHashMap }<{@link Integer },{@link HashMap}<{@link Integer},{@link String}>>
     */
    public static LinkedHashMap<Integer, HashMap<Integer, String>> getLesson06() {
        LESSON_06 = new LinkedHashMap<>();
        LESSON_06.put(1, hashMapGenerator(HEADER_LEVEL_1, "ආයතනයන්හි විවිධ යෙදුම් ක්\u200Dෂේත්\u200Dර වල තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය භාවිතය\u200B (Investigates the use of ICT in different field of applications in organizations)"));
        LESSON_06.put(2, hashMapGenerator(DESCRIPTION, "තොරතුරු හා  සන්නිවේදන තාක්\u200Dෂණය යනු දත්ත සැකසීම හා සන්නිවේදනය සඳහා උපයොගී කරගන්නා වූ ඕනෑම තාක්ෂණික ක්\u200Dරම වේදයකි.දත්ත ගබඩා කිරීම (Storage),සමුද්ධරණය (Retrieval),මෙභෙයවීම (Manipulation), සම්ප්\u200Dරේෂණය (Transmission) හා ලැබීම (Receipt) ආදීය තොරතුරු හා  සන්නිවේදන තාක්\u200Dෂණය යටතේ සැලකිල්ලට ගනී."));
        LESSON_06.put(3, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_1)));
        LESSON_06.put(4, hashMapGenerator(IMAGE_DESCRIPTION, "අවුරුදු කිහිපයකට පෙර ආයතනයක් තුළ වැඩ කටයුතු කෙරුනු අන්දම\u200B"));
        LESSON_06.put(5, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_2)));
        LESSON_06.put(6, hashMapGenerator(IMAGE_DESCRIPTION, "වර්ත\u200Bමානයේ පරිඝණක අශ්\u200Dරයෙන් ආයතනයක් තුළ වැඩ කටයුතු කරන අන්දම\u200B"));
        LESSON_06.put(7, hashMapGenerator(DESCRIPTION, "අන්තර්ජලය, දුරකථනය, පරිගණක, දෘඩාංග හා ඩිජිටල් තාක්\u200Dෂණික ක්\u200Dරම භාවිතයෙන් එක් ස්ථානයක සිට තවත් ස්ථානයකට තොරතුරැ හුවාමාරුකිරීමේ පහසුකම නිසා ආයතන තුළ බොහො කාර්\u200Dයයන් පහසුවෙන් කරගත හැකිය\u200B. එවිට අවම මිනිස් ශ්\u200Dරමයකින් හා වැඩි කාර්\u200Dයක්ශමතාවකින් කටයුතු කරගත හැක\u200B. අවම මිනිස් ශ්\u200Dරමයක් යනු අයතනයේ භෞතික ඉඩ ප්\u200Dරමාණය ඉතිරි වීම හා කම්කරු සුභ සාධන වියදම් අවම වීමයි. එමගින් අයතනික වශයෙන් වැඩි ලාභයක් උපයා ගනීමේ අවස්ථාවක් ලැබේ. "));
        LESSON_06.put(8, hashMapGenerator(DESCRIPTION, "උදාහරණයක් ලෙස ආයතනයේ දුරස්තර ශාඛා දෙකක් අතර රාජකාරී ලිපියක් යැවීම සම්බන්ධයෙන් සිතා බලන්න\u200B. අතීතයේදී තැපැල් මඟින් ලිපි හුවමරුවකදී වැයවන කාලය\u200B, මුදල හා ශ්\u200Dරමය යන සියල්ල නූතනයේදී විද්\u200Dයුත් තෑපෑලක් (e-mail) යැවීම මඟින් ඉතිරි කරගත හැක\u200B. "));
        LESSON_06.put(9, hashMapGenerator(DESCRIPTION, "ආයතන තුළ විවිධ ක්\u200Dෂේත්\u200Dර ඔස්සේ තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය භාවිතා කරන අවස්ථා කිහිපයක් දැන් විමසා බලමු.\n" +
                "ආයතන තුළ විවිධ ක්\u200Dෂේත්\u200Dර ඔස්සේ තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය භාවිතා කරන අවස්ථා කිහිපයක් දැන් විමසා බලමු "));
        LESSON_06.put(10, hashMapGenerator(DESCRIPTION_LIST, "1. සන්නිවේදන කටයුතු සඳහා\n" +
                "2. දැන්වීම් ප්\u200Dරචාර\u200Bණ කටයුතු සඳහා\n" +
                "3. ඉගෙනුම් ඉගැන්වීම් ක්\u200Dරියවලිය\u200B සඳහා"));
        LESSON_06.put(11, hashMapGenerator(HEADER_LEVEL_2, "සන්නිවේදන හා බැඳි තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය (ICT in Communication)"));
        LESSON_06.put(12, hashMapGenerator(HEADER_LEVEL_3, "ඉදිරිපත් කිරීම් (Presentations)"));
        LESSON_06.put(13, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_3)));
        LESSON_06.put(14, hashMapGenerator(DESCRIPTION, "ඉදිරිපත් කිරීම් යනු අදහස් හා තොරතුරු පිරිසක් ඉදිරියේ සන්නිවේදනය කරනා ක්\u200Dරියවලියයි. මාතෘකාවට අඳාල අන්තර්ඝතය පරිගණකය අශ්\u200Dරයෙන් හෝ වෙනත් අයුරකින් ප්\u200Dරේක්\u200Dෂකයා වෙත ඉදිරිපත් කල හැක. මෙය යම් ආකාරයකට වාර්ථාවක් සැපයීමකට සමානය\u200B." + "\n" + "නමුත් ඉදිරිපත් කිරීමකදී ඉදිරිපත් කරන්නාගේ පෞර්ෂත්වය හා සහභාගීවන්නගේ මැදිහත් වීම් (Interaction) නිසා ඉදිරිපත් කිරීමක් වාර්ථාවකින් වෙනස් වේ. " + "\n" + "නිවැරදි ඉදිරිපත් කිරීමකදී ප්\u200Dරධාන අංග 4ක් පිළිබඳ අවධානය යොමු වේ. "));
        LESSON_06.put(15, hashMapGenerator(DESCRIPTION_LIST, "╬ අන්තර්ඝතය (Content)\u200B - ප්\u200Dරේක්\u200Dෂකයාට ලබාදීමට අපේක්\u200Dෂා කරන තොරතුරු හෝ විෂය කරුණට අඳාලව අන්තර්ඝතය සකස් කල යුතුය\u200B. " + "\n" + "╬ ව්\u200Dයූහය (Structure) - සවන් දෙන්නාට පහසුවෙන් තෙරුම් ගත හැකි තර්කානුකූල ආරම්භයක්, මධ්\u200Dයස්ථයක් හා අවසානයක් ඉදිරිපත් කිරීමක තිබිය යුතුය." + "\n" + "╬ ඇසුරුම (Package) - ඉදිරිපත් කිරීම ඉතා නිවැරදි හා මනා සූදානමකින් කළ යුතුය\u200B. පිරිසක් ඉදිරියේ සිදුවන නිසා තොරතුරු වල නිවැරදි බව මෙන්ම ප්\u200Dරෙක්\u200Dෂකයගේ ප්\u200Dරශ්න වලට නිසි පිළිතුරු සැපයීමේ හැකියව පිළිබඳ විශේෂ අවධානයක් යොමු වේ. " + "\n" + "╬ මානව සම්පත (Human Resource)\u200B - ඉදිරිපත් කරන්නා හා ප්\u200Dරේක්\u200Dෂකයන් මේ යටතට අයත් වේ."));
        LESSON_06.put(16, hashMapGenerator(DESCRIPTION, "ඉදිරිපත් කරන්නාගේ වටිනාම ආයුධය කට හඬයි. සවන් දෙන්නා වෙත වැඩිම කරුණු ප්\u200Dරමාණයක් ගෙනයන්නේ එමගිනි. සාර්ථක ඉදිරිපත් කිරීමක් සඳහා විවිධ අවස්ථාවල කට හඬහි ස්වරය (Tone), උස් පහත් ප්\u200Dරමාණය (Pitch) හා ශබ්ද ප්\u200Dරමාණය (Volume) වෙනස් කිරීම පිළිබඳ අවධානය යොමු කළ යුතුය. මීට අමතරව අභිනය (Gesture), මුහුනෙණ් හැඟීම් ප්\u200Dරකශ කිරීම් (Facial expression) ආදියද ඉදිරිපත් කිරීමකදී කැපී පෙනේ. ඉදිරිපත් කිරීමකදී සවන් දීමද ඉතා වැදගතවේ. ප්\u200Dරේක්\u200Dෂකයාගේ අදහස් වලට සවන් දීම ප්\u200Dරශ්න ඉදිරිපත් කිරීමට අවස්ථාව ලබා දීම සාර්ථක ඉදිරිපත් කිරීමක ලක්\u200Dෂණවේ."));
        LESSON_06.put(17, hashMapGenerator(HEADER_LEVEL_3, "නිවසේ සිට සන්නිවේදන ජාල ඔස්සේ කාර්\u200Dයල කටයුතු කිරීම (Telecommuting)"));
        LESSON_06.put(18, hashMapGenerator(DESCRIPTION, "නිවසේ සිට සන්නිවේදන ජාල ඔස්සේ කාර්\u200Dයල කටයුතු කිරීම “Telecommuting” ලෙස හැඳින් වේ. සේවකයන්ට ප්\u200Dරධාන සේවා ස්ථානයකට යාමකින් තොරව නිවසේ සිට තම වැඩ කොටස නිම කිරීමේ හැකියාව මින් සැපයේ. එසේ ක්\u200Dරියා කරන තැනැත්තා “Telecommuter” නම් වේ. මින් බොහො දෙනෙක් නිවසේ සිට කටයුතු කරන අතර “Nomad workers” නමින් හඳුන්වන පිරිස අවන්හල් හො වෙනත් ස්ථානවල සිට ජංගම ටෙලිසන්නිවේදන භාවිතා කරමින් කාර්\u200Dයල කටයුතු කරයි."));
        LESSON_06.put(19, hashMapGenerator(HEADER_LEVEL_3, "වීඩියෝ සම්මන්ත්\u200Dර\u200Bණ (Video Conferencing) "));
        LESSON_06.put(20, hashMapGenerator(DESCRIPTION, "වෙනත් ස්ථාන වල සිටින දෙදෙනෙක් අතර ශ්\u200Dරව්\u200Dය හා දෘශ්\u200Dය දත්ත සම්ප්\u200Dරේෂණය කරමින් පරිගණක ජාල අසුරින් සංවාදයක් පැවැත්වීම වීඩියෝ සම්මන්ත්\u200Dරණයක් ලෙස හැඳින්වේ. ව්\u200Dයාපාර සමුළු පැවැත්වීම් (Business meetings), දුරස්ථ අධ්\u200Dයාපන කටයුතු සිදුකිරීම් (Distance Learning), නිවසේ සිට සන්නිවේදන ජාල ඔස්සේ කාර්\u200Dයල කටයුතු කිරීම් (Telecommuting) ආදී විවිධ අවස්ථාවලදී වීඩියෝ සම්මන්ත්\u200Dරණයක් භාවිතා වේ. ගමන් වියදම් අවම වීම, කාලය කළමනකරණය\u200B, තීරණ ගැනීමේ හැකියව ඉහල යාම\u200B, කෙටි හා කේඳ්\u200Dරගත සමුළු පැවැත්වීමේ හැකියව හා සම්මුඛ පරීක්\u200Dෂණ පැවැත්වීමේ පහසුකම\u200Bආදී සේවා රැසක් මෙ තුළින් සැලසේ. "));
        LESSON_06.put(21, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_4)));
        LESSON_06.put(22, hashMapGenerator(DESCRIPTION, "මේ යටතේ සාකචඡා කළ යුතු නවතම ප්\u200Dරවණතාවක් නම් “Telemedicine” යන්නයි. වෛද්\u200Dය උපදෙස් සඳහා භෞතචිකිත්සකයා වෙත යා නොහැකි වන රෝගීන්ට වීඩියෝ සම්මන්ත්\u200Dරණයක් මඟින් පහසුවෙන් වෛද්\u200Dයවරයා හමුවිය හැක\u200B. සියළුම වෛද්\u200Dය අවශ්\u200Dයතා එමඟින් සැපිරීම කළ නොහැකි වුවද, ලොව කොහේ සිටියත් රෝගීයා වෙත අවශ්\u200Dය උපදෙස් හා මග පෙන්වීම සැපිරීම සිදුකල හැක\u200B. "));
        LESSON_06.put(23, hashMapGenerator(HEADER_LEVEL_3, "ප්\u200Dරචාරණයහා බැඳි තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය (ICT in Advertising) "));
        LESSON_06.put(24, hashMapGenerator(DESCRIPTION, "බොහෝ ව්\u200Dයාපාර සහ සංවිධාන තම නිශ්පාදන සහ සේවාවන් මිලදි ගෙනීම සදහා පරිභොගිකයන් පොළබවා ගැනීමට වෙළද ප්\u200Dරචාරණය භාවිතා කරයි. නවීන ලෝකයේ තොරතුරු හා සන්නිවෙදන තාක්ෂණය වෙළද ප්\u200Dරචාරණය සදහා ප්\u200Dරධාන මාධ\u200Dය්\u200Dය ලෙස භාවිතා කරයි. තොරතුරු හා සන්නිවෙදන තාක්ෂණය විසින් අනෙක් මාධ\u200Dය්\u200Dයයන් හරහා ලබා ගැනීමට නොහැකි ආකාරයේ සම්පූර්ණයෙන්ම නව සහ නවෝත්පාදිත මාර්ගයන් රැසක් මගින්, අලුත් සහ විශාල පරිභොගිකයන් ප්\u200Dරමාණයකට ලගා වීමට හැකියාව ලබා දී තිබේ. ප්\u200Dරධාන ප්\u200Dරචාරණ අකාර 3 කි. "));
        LESSON_06.put(25, hashMapGenerator(DESCRIPTION_LIST, "╬ නිමැවුම් ප්\u200Dරචාරණය (Product Advertising)\n" + "╬ ව්\u200Dයාපාරික ප්\u200Dරචාරණය\u200B (Business Advertising)\n" + "╬ සේවා ප්\u200Dරචාරණය\u200B (Service Advertising)"));
        LESSON_06.put(26, hashMapGenerator(HEADER_LEVEL_3, "නිමැවුම් ප්\u200Dරචාරණය (Product Advertising) "));
        LESSON_06.put(27, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_5)));
        LESSON_06.put(28, hashMapGenerator(DESCRIPTION, "යම් නිශ්චිත භාණ්ඩයක් පිළිබඳ වෙළඳ ප්\u200Dරචාරණයක් සිදු කිරීම මේ නමින් හැඳින් වේ. නිමැවුම් ප්\u200Dරචාරණයේ අදියර 3කි. "));
        LESSON_06.put(29, hashMapGenerator(DESCRIPTION_LIST, "╬ ඉලක්ක කරගත් පිරිස හඳුනා ගැනීම\n" + "╬ සුඳුසු ප්\u200Dරචාරණ ක්\u200Dරියාවලිය හඳුනා ගැනීම\n" + "╬ සුඳුසු සන්නිවේදන මාධ්\u200Dය තෝරාගැනීම "));
        LESSON_06.put(30, hashMapGenerator(HEADER_LEVEL_3, "ව්\u200Dයාපාරික ප්\u200Dරචාරණය\u200B (Business Advertising)"));
        LESSON_06.put(31, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_6)));
        LESSON_06.put(32, hashMapGenerator(DESCRIPTION, "මෙහිදී සිඳු වන්නේ ව්\u200Dයාපාරය ප්\u200Dරචලිත කරවීම හෙවත් වෙළෙඳ සමාගම ප්\u200Dරචලිත කරවීමයි. ව්\u200Dයාපාරික ප්\u200Dරචාරණයේදීද, නිමැවුම් ප්\u200Dරචාරණයේදී භාවිතා වූ අදියර 3 යොදා ගැනේ."));
        LESSON_06.put(33, hashMapGenerator(HEADER_LEVEL_3, "සේවා ප්\u200Dරචාරණය\u200B (Service Advertising) "));
        LESSON_06.put(34, hashMapGenerator(DESCRIPTION, "ප්\u200Dරචාරණය සිදු වන්නේ භාණ්ඩ පිළිබඳව නොව සේවාවන් පිළිබඳවයි. උදාහරණ ලෙස "));
        LESSON_06.put(35, hashMapGenerator(DESCRIPTION_LIST, "රක්\u200Dෂණ සේවා\n" + "රාජ්\u200Dයය සේවා\n" + "සංචාරක සේවා\n" + "බැංකු සේවා\n" + "අධ්\u200Dයාපන සේවා\n" + "සාමාජ සේවා\n"));
        LESSON_06.put(36, hashMapGenerator(DESCRIPTION, "දැක්විය හැක\u200B. සේවා සපයන ආයතන ප්\u200Dරධාන ආකාර 2කි. එනම් ලාභ ලබන හා ලාභ නොලබන ආයතන වශයෙනි. "));
        LESSON_06.put(37, hashMapGenerator(DESCRIPTION, "ලාභ ලබන ආයතන තම ආදායම් වැඩි කරගැනීම සඳහා වෙළඳ ප්\u200Dරචාරණ කටයුතු වල නිරත වේ. රාජ්\u200Dය \u200B, සමාජ සේවා හා අධ්\u200Dයාපන සංවිධාන වැනි ලාභ ලැබීමේ පරමාර්ථයක් නොමැති ආයතන තමන් සපයන සේවා පිළිබඳව ජනතාව දැනුවත් කිරීම සඳහා ප්\u200Dරචාරණ කටයුතු වල යෙදේ. "));
        LESSON_06.put(38, hashMapGenerator(DESCRIPTION, "වෙළඳ ප්\u200Dරචාරණයේදී තොරතුරුහා සන්නිවේදන තාක්\u200Dෂණය භාවිතය"));
        LESSON_06.put(39, hashMapGenerator(DESCRIPTION_LIST, "╬ වෙබ් අඩවියක් පවත්වා ගෙන යාම\u200B (Web Sites) – ව්\u200Dයාපාරය සඳහා වෙබ් අඩවියක් පවත්වා ගෙන යාමෙන් ජාතික හා අන්තර්ජාතික මට්ටමෙන් ප්\u200Dරචාරණයක් දියත් කළ හැක\u200B. මෙය ලාභදායී වෙළඳ ප්\u200Dරචාරණ ක්\u200Dරියාවලියකි.\n" + "╬ අන් අයගේ වෙබ් අඩවියක දැන්වීම පළකීරීම\u200B (Advertising on other people’s websites)- තමාගේම වෙබ් අඩවියක් පවත්වා ගැනීමට වඩා මෙම ක්\u200Dරමය ලාභදායී වේ. උදාහරණ Web banner , pop up advertisement.\n" + "╬ අන්තර්ජාල නාමාවලිය (Online Directory)- ව්\u200Dයාපාර හා සේවා සපයන්නන් පිළිබඳ තොරතුරු ඇතුළත් කර ඇත\u200B. උදාහරණwww.yell.com\n" + "╬ බහු මාධ්\u200Dය ඉදිරිපත් කිරීම් (Multimedia Presentations)- වෙළඳ සංකීර්ණ, ගුවන් තොටුපළ ආදී ස්ථාන වල බහුලව දක්නට ලැබෙන ඉදිරිපත් කිරීම් හරහා දවස පුරාම ප්\u200Dරචාරණයන් සිදුකල හැක. යාවත්කාලින හා පාලනය කිරීමේ පහසුව මෙහි ඇත\u200B.\n" + "╬ Flyers – එක් පිටු කුඩා පත්\u200Dරිකාවකි. කුඩා ව්\u200Dයපාර සඳහා ප්\u200Dරාදේශ්\u200Dරීය මට්ටමින් ප්\u200Dරචාරණයක් දීමට භාවිතා වන ලාභ දායී ක්\u200Dරමයකි .\n" + "╬ පෝස්ටර (Posters)\n"));
        LESSON_06.put(40, hashMapGenerator(HEADER_LEVEL_3, "ඉගෙනුම්-ඉගැන්වීම් ක්\u200Dරියාවලිය\u200B හා බැඳි තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය (ICT in Learning and Teaching)"));
        LESSON_06.put(41, hashMapGenerator(DESCRIPTION, "අධ්\u200Dයාපන කටයුතු සඳහා තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණය භාවිතයෙන් සාම්ප්\u200Dරදායික\u200B අධ්\u200Dයාපන ක්\u200Dරමවේදයෙන් ඔබ්බට ගිය වාසි රැසැක් අත්පත් කරගත හැක\u200B. "));
        LESSON_06.put(42, hashMapGenerator(DESCRIPTION, "ඉගැන්වීමේදී අනුරූප (Images) භාවිතයෙන් සිසුගේ ධාරණ ශක්තිය වැඩි (retentive memory) කරගත හැක. ගුරුවරුන්ට සංකීර්ණ කරුණු පහසුවෙන් පැහැදිලි කිරීමේ හා සිසුන්ට එය අවබෝධ කිරීමේ හැකියාව (comprehension) වැඩිවේ. පංති කාමරයේ අන්තර් ක්\u200Dරියාකාරිත්ව වැඩි වන අතර විනෝදයෙන් ඉගෙනුම් කටයුතු කිරීමේ හැකියව නිසා සිසුන් ගේ පාසල් පැමිණීම හා පාඩම් කෙරෙහි ඇති අවධානය දියුණු වේ. "));
        LESSON_06.put(43, hashMapGenerator(HEADER_LEVEL_3, "පරිඝණකය ආධාරයෙන් ඉගෙනීම\u200B (Compute Aided Learning) "));
        LESSON_06.put(44, hashMapGenerator(IMAGE, String.valueOf(R.drawable.lesson6_img_7)));
        LESSON_06.put(45, hashMapGenerator(DESCRIPTION, "සාම්ප්\u200Dරදායික ඉගෙනුම් ක්\u200Dරම වලට විකල්පයක් ලෙස පරිඝණක ආධාරකයක් ලෙස භාවිත කර ඉගැන්වීම නිසා පාඩම අවබෝධ කරගැනීමේ හැකියාව වැඩිවීම, ධාරණය කරගැනීමේ හැකියාව වැඩිවීම, සංකීර්ණ කරුණු පහසුවෙන් පැහැදිලි කිරීමේ පහසුකම ආදී විශේෂ වාසි රැසැක් හිමිවේ. "));
        LESSON_06.put(46, hashMapGenerator(HEADER_LEVEL_3, "පරිගණක පාදක ඉගෙනීම\u200B (Computer Based Learning) "));
        LESSON_06.put(47, hashMapGenerator(DESCRIPTION, "පරිගණක පාදක කොට ගත් ඉගනුම් ක්\u200Dරියාවලිය\u200B යනු පරිගණකය අතුරු මුහුණත ලෙස සළකන්නා වූ ඉගනුම් ක්\u200Dරියාවලියකි\u200B. පරිගණක පාදක කොට ගත් ඉගනුම් ක්\u200Dරියාවලිය භාවිතා කරනුයේ සිද්ධීන්, ක්\u200Dරියාවලීන්, කුසලතා සහ ශිල්පක්\u200Dරම පිලිබද දැනුම ආධුනිකයන් වෙත ලබා දීමටය\u200B.\n" + "පරිගණක විසින් මෙම ක්\u200Dරියාවලිය ඉතා විශිෂ්ට ලෙස ඉටු ලබයි\u200B."));
        LESSON_06.put(48, hashMapGenerator(DESCRIPTION_LIST, "╬ සියලු දෙනාටම එකම තොරතුර ලබා දෙන හෙයින් සංගතතාව (Consistent) ආරක්ෂා වේ.\n" + "╬ ඉදිරිපත් කල යුතු වැදගත් කරුණු අතපසු වීම සිදු නොවේ.\n" + "╬ ඉවසිලිවන්ත වේ, යමෙකුගේ ඉගනුම් ඒකකයක් අවසන් වනතෙක් කොපමණ වෙලවක් වුවද සිටිය හැකිය\u200B.\n" + "╬ දවසේ ඕනෑම වෙලාවක ප්\u200Dරවේශ වීමේ හැකියාව ඇත, ඒ සදහා ඔබට පුද්ගලයන් කණ්ඩායමක් කිසියම් ස්ථානයකට එක් කිරිමට අවශ්\u200Dය නොවේ.\n" + "╬ තොරතුරු ධාරණය කිරීමේ හැකියාව පරීක්\u200Dෂා කිරීමට භාවිතා කල හැක.\n" + "╬ මිල අධික නොවේ.\n"));
        LESSON_06.put(49, hashMapGenerator(DESCRIPTION, "එය පුළුල් පරාසයක ඉගනුම් සහ සංවර්ධන ක්\u200Dරියාවලීන් සදහා භාවිතා කල හැකි අතර\u200B, අන්\u200Dතර්ජාලය\u200B මගින් ලබා දුන්හොත්, පහසුවෙන් වෙනස් කිරීමට සහ යාවත්කාලීන කිරිම් ක්\u200Dෂණිකව සිදු කිරිමට හැකියාව ලැබේ. "));
        LESSON_06.put(50, hashMapGenerator(HEADER_LEVEL_3, "පරිඝණක පාදක ඇගයීම (Computer Based Assessment)"));
        LESSON_06.put(51, hashMapGenerator(DESCRIPTION, "පැවරුම් ඇගයීම හා උත්තර පත්\u200Dර පරීක්\u200Dෂා කිරීම් ආදිය සඳහා පරිඝණකය භාවිතයෙන් ඇගයීම් කටයුතු කිරීම මෙසේ හැඳින්වේ. ස්වයංක්\u200Dරීයව මෙභෙයවන නිසා ඇගයීම් නිළධාරියෙකු අවශ්\u200Dය නොවීම. ඉක්මන් ප්\u200Dරථිඵල ලබා ගත හැකිවීම\u200B. නිරවද්\u200Dයතාව ඉහළ මට්ටමක පැවතීම ආදී වාසි මින් සැලසේ."));
        LESSON_06.put(52, hashMapGenerator(DESCRIPTION, "යම් නිශ්චිත භාණ්ඩයක් පිළිබඳ වෙළඳ ප්\u200Dරචාරණයක් සිදු කිරීම මේ නමින් හැඳින් වේ. නිමැවුම් ප්\u200Dරචාරණයේ අදියර 3කි."));
        LESSON_06.put(53, hashMapGenerator(DESCRIPTION, "තොරතුරු හා සන්නිවේදන තාක්\u200Dෂණයේ දියුණුවත් සමඟ සන්නිවේදන , අධ්\u200Dයාපන, ව්\u200Dයාපාර, පරිපාලන ආදි සමාජයේ සෑම පැතිකඩකම පාහේ දියුණුවක් සිදුවී ඇති බව ඔබට වැටහෙනවා ඇත\u200B."));
        return LESSON_06;
    }

    /**
     * Get the list of lesson details as list of MenuModel
     * @return {@link List}<{@link MenuModel}>
     */
    public static List<MenuModel> getLessonList() {


        List<MenuModel> list = new ArrayList<>();
        Method[] methods = Lessons.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getReturnType().equals(LinkedHashMap.class)) {
                MenuModel model = new MenuModel();
                try {
                    LinkedHashMap<Integer, HashMap<Integer, String>> lh = (LinkedHashMap<Integer, HashMap<Integer, String>>) method.invoke(null);
                    Set set = lh.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) iterator.next();
                        Set valueSet = ((HashMap) entry.getValue()).entrySet();
                        Iterator valueIterator = valueSet.iterator();
                        String methodName = method.getName();
                        String[]header = methodName.split("get");
                        model.setTag(methodName);
                        model.setHeader(header[1]);
                        boolean titleState = false;
                        boolean imgState = false;
                        while (valueIterator.hasNext()) {
                            if (!titleState || !imgState) {
                                Map.Entry valueEntry = (Map.Entry) valueIterator.next();
                                if (valueEntry.getKey().equals(Lessons.HEADER_LEVEL_1)) {
                                    model.setTitle(valueEntry.getValue().toString());
                                    titleState = true;
                                }
                                if (valueEntry.getKey().equals(Lessons.IMAGE)) {
                                    model.setImage(valueEntry.getValue().toString());
                                    imgState = true;
                                }
                            }else{
                                break;
                            }
                        }
                    }
                    list.add(model);
                } catch (IllegalAccessException | IllegalArgumentException
                        | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
