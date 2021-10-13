package uz.gita.smartkids.quiz_reprository;

import java.util.ArrayList;
import uz.gita.smartkids.data.QuestionData;
import uz.gita.smartkids.quiz_contract.QuizContract;
public class QuizReprository implements QuizContract.Model {
    private ArrayList<QuestionData> data = new ArrayList<>();
    public QuizReprository() {
        loadData();
    }

    private void loadData (){
//            data.add(new QuestionData("Undan qanchalik ko’p olaversangiz, u shunchalik kattalashib boraveradi. U nima?", "Chuqur", "Pul", "Hamyon", "Non", "Chuqur"));
//            data.add(new QuestionData("Kichkina, kulranggina, filga o’xshaydi.", "Eshshak", "Ot", "Filning bolasi", "Eshakning bolasi", "Filning bolasi"));
//            data.add(new QuestionData("Merining otasining beshta qizi bor. Ularning ismlari Chacha, Cheche, Chichi, Chocho… Beshinchi qizining ismi nima bo’lishi mumkin?", "Meri", "Chacha", "Lolo", "Chana", "Meri"));
//            data.add(new QuestionData("Qaysi inson otni ham, filni ham hech bir qiyinchiliksiz ko’tarishga, ularni joyini o’zgartirishga qodir?", "Futbolchi", "Shaxmatchi", "Qassob", "Firibgar", "Shaxmatchi"));
//            data.add(new QuestionData("Qaysi yegulikni pishirishda qancha tuz solsa ham, u sho’r bo’lib ketmaydi?", "Sumalak", "Qaynatilgan tuxum", "Qovirilgan tuxum", "Sho'rva", "Qaynatilgan tuxum"));
//            data.add(new QuestionData("Kim o’tirgan holda yuradi?", "Suzuvchi", "Bemor", "Shahmatchi", "Futbolchi", "Shahmatchi"));
//            data.add(new QuestionData("U savol emas, lekin unga javob berish kerak.", "Telefon jiringlashi", "Uxlash", "Dam olish", "Ovqatlanish", "Telefon jiringlashi"));
//            data.add(new QuestionData("Hamma narsani ko’rayotganda uni ko’rmaysiz. Hech narsani ko’rmaganda esa uni ko’ra olasiz. U nima?", "Lampochka", "Tush", "Qorong'ulik", "Osmon", "Qorong'ulik"));
//            data.add(new QuestionData("Men suvman va suv yuzasida suzib yuripman. Men kimman?", "Baliq", "O'rdak", "Muz", "Pufak", "Muz"));
//            data.add(new QuestionData("Nimani 10 daqiqadan ortiq ushlab turishning iloji yo’q, garchi u o’ta yengil bo’lsa ham", "Qopni", "Suvni", "Nafasni", "Vadani", "Nafasni"));
//
//            data.add(new QuestionData("Ko’rganda quvonamiz, lekin baribir ko’zimizni olib qochamiz?", "Telefon", "Quyosh", "Osmon", "Doktor", "Quyosh"));
//            data.add(new QuestionData("Uni chap qo’l bilan ushlasa bo’ladi, lekin o’ng qo’l bilan hech qachon ushlab bo’lmaydi?", "Ko'z", "O'ng qol bilagi", "Chap qo'l bilagi", "Bo'yin", "O'ng qol bilagi"));
//            data.add(new QuestionData("Qaysi qush burunidagi ko'zoynak bilan uchadi?", "Tovus", "Boyo'g'li", "Qarg'a", "Chumchuq", "Boyo'g'li"));
//            data.add(new QuestionData("Qishda kim uyquga ketadi?", "Bo'ri", "Ayiq", "Tulki", "Qorbobo", "Ayiq"));
//            data.add(new QuestionData("Prezident tomonidan imzolangan narsa", "Qonun", "Qaror", "Xat", "Taklifnome", "Qaror"));
//            data.add(new QuestionData("Buqaning eng yoqimsiz rangi?", "Oq", "Qora", "Sariq", "Qizil", "Qizil"));
//            data.add(new QuestionData("Nimaga qarab 2 ni 10 deymiz?", "Doskaga", "Soatga", "Sumkaga", "Kitobga", "Soatga"));
//            data.add(new QuestionData("Xonaning qaysi joyiga qalam qo’yilsa, uning ustidan sakrab o’tib bo’lmaydi?", "Burchakka", "O'rtaga", "Tomiga", "Derazaga", "Burchakka"));
//            data.add(new QuestionData("U sizniki, lekin undan sizdan ko’ra boshqalar ko’proq foydalanishadi?", "Pulingiz", "Ismingiz", "Ruchkangiz", "Telefoningiz", "Ismingiz"));
//            data.add(new QuestionData("Ko’p qavatli kiyim kiygan, usti yashil ichi sariq, bolalari qator-qator, pishganda mazali?", "Qovun", "Piyoz", "Makkajo'xori", "Karam", "Makkajo'xori"));
//
//            data.add(new QuestionData("Chir-chir qushlar, chirmashiq qushlar, O'zinh joni yo'q odam kelsa tishlar", "It", "Qopqon", "Tikon", "Yolg'on", "Tikon"));
//            data.add(new QuestionData("Quduqqa tushkan qush aqanday chiqadi?", "Yurib", "Xo'l bo'lib", "Uxlab", "Chiqmaydi", "Xo'l bo'lib"));
//            data.add(new QuestionData("Karim 8 ga to'lganida otasi 31 yoshda edi, endi otasi Karimda 2 baravar katta. Oradan necha yil vaqt o'tdi?", "10 yil", "15 yil", "23 yil", "35yil", "15yil"));
//            data.add(new QuestionData("Inson o'zi yashaydigan joydan 90 km uzoqlashsa nima bo'ladi?", "Musofir", "Muqim", "Boy", "Kambag'al", "Musofir"));
//            data.add(new QuestionData("5 ta tuxum 10 daqiqada pishadi? 2 tasichi?", "4 daqiqa", "2 daqiqa", "10 daqiqa", "12 daqiqa", "10 daqiqa"));
//            data.add(new QuestionData("Qanday idishdan umuman hech qanday ovqat yeb bo’lmaydi?", "Bo’sh idishdan", "Katta idishdan", "Siniq idishdan", "Kichik idishdan", "Bo’sh idishdan"));
//            data.add(new QuestionData("Elak bilan qanday suv tashish mumkin?", "Mumkin emas", "Muz qilib", "Yog' qo'shib", "Tuz qo'shib", "Muz qilib"));
//            data.add(new QuestionData("Kun va tun nima bilan tugaydi?", "N harfi bilan", "Quyosh chiqishi bilan", "Quyosh botishi bilan", "Tugamaydi", "N harfi bilan"));
//            data.add(new QuestionData("2 + 2 * 2 javobi nechchi?", "6", "8", "10", "2", "6"));
//            data.add(new QuestionData("Uning balandligi ham, bo’yi ham, eni ham yo’q, lekin uni o’lchasa bo’ladi. U nima?", "Harorat", "Muz", "Suv", "Shakar", "Harorat"));
//
//            data.add(new QuestionData("Yer yuzidagi barcha aholi bir vaqtning o’zida nima qiladi?", "Uxlaydi", "Ulg’ayadi", "Ovqatlanadi", "Tug'uladi", "Ulg’ayadi"));
//            data.add(new QuestionData("Bir kilo tosh og’irmi yoki bir kilo paxta?", "Tosh", "Paxta", "Teng", "1 kilo suv", "Teng"));
//            data.add(new QuestionData("Qaysi hayvonlar ko’zini ochgan holda uxlaydi?", "Baliq", "Ayiq", "Tulki", "Chumchuq", "Baliq"));
//            data.add(new QuestionData("Ustozning Farhod ismli akasi bor edi, lekin Farhodning ukasi yo’q edi. Buning sababi qanday?", "Ustoz qiz bola", "Farxodni akasi bor", "Ustozni singlisi bor", "Ustoz begona shaxs", "Ustoz qiz bola"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));
//            data.add(new QuestionData("20+110=?", "130", "20", "24", "34", "130"));

            data.add(new QuestionData("20+110=?", "130", "120", "100", "90", "130"));
            data.add(new QuestionData("18+60=?", "68", "73", "78", "95", "78"));
            data.add(new QuestionData("89-60=?", "30", "41", "29", "59", "29"));
            data.add(new QuestionData("10*2+10=?", "22", "30", "35", "20", "30"));
            data.add(new QuestionData("90-18+2=?", "70", "51", "78", "110", "70"));
            data.add(new QuestionData("48+7+8=?", "65", "63", "78", "56", "63"));
            data.add(new QuestionData("120-90-10=?", "30", "20", "10", "40", "20"));
            data.add(new QuestionData("99+11-12=?", "98", "99", "100", "120", "98"));
            data.add(new QuestionData("29+43-15=?", "53", "58", "57", "63", "57"));
            data.add(new QuestionData("119+68-23=?", "164", "154", "145", "169", "164"));

            data.add(new QuestionData("3*5+10=?", "35", "25", "28", "150", "25"));
            data.add(new QuestionData("53+7-30=?", "30", "60", "2", "45", "30"));
            data.add(new QuestionData("99/11-8=?", "10", "11", "1", "90", "1"));
            data.add(new QuestionData("19+11+13-30=?", "13", "33", "34", "15", "13"));
            data.add(new QuestionData("2*9+7=?", "24", "25", "23", "27", "25"));
            data.add(new QuestionData("(19+11)/3=?", "11", "10", "30", "1", "10"));
            data.add(new QuestionData("(67-17)/2=?", "30", "45", "25", "20", "25"));
            data.add(new QuestionData("9*(81/9)=?", "81", "9", "18", "72", "81"));
            data.add(new QuestionData("(19+17)/4=?", "6", "9", "42", "10", "9"));
            data.add(new QuestionData("(90-45) /9 =?", "6", "7", "5", "9", "5"));

            data.add(new QuestionData("(63/7) * 10=?", "81", "90", "70", "56", "90"));
            data.add(new QuestionData("(123-13) /10 * 8=?", "88", "99", "110", "30", "88"));
            data.add(new QuestionData("6 *(48/8)=?", "36", "60", "48", "56", "36"));
            data.add(new QuestionData("(7*9) + 58=?", "130", "120", "121", "131", "121"));
            data.add(new QuestionData("29+13-22=?", "30", "20", "22", "18", "20"));
            data.add(new QuestionData("(93-13) /8=?", "8", "11", "10", "9", "10"));
            data.add(new QuestionData("(47+9+9)-5=?", "50", "60", "65", "55", "60"));
            data.add(new QuestionData("(28/4)*7+1=?", "48", "49", "50", "51", "50"));
            data.add(new QuestionData("(180-60)/2=?", "70", "60", "65", "75", "60"));
            data.add(new QuestionData("(8*11)-8=?", "80", "90", "72", "88", "80"));


        data.add(new QuestionData("(72-9) / 9=?", "8", "7", "9", "6", "7"));
        data.add(new QuestionData("(13*3)+11=?", "40", "30", "50", "60", "50"));
        data.add(new QuestionData("(89-18)+(11+45) =?", "93", "88", "86", "89", "86"));
        data.add(new QuestionData("(99/11)* 7-30=?", "33", "30", "27", "40", "33"));
        data.add(new QuestionData("(59-12) * 3=?", "150", "181", "141", "139", "141"));
        data.add(new QuestionData("15 * (90/9)=?", "150", "140", "135", "100", "150"));
        data.add(new QuestionData("(78/3)*2=?", "50", "52", "26", "42", "52"));
        data.add(new QuestionData("(83-13) * 3=?", "200", "180", "210", "220", "210"));
        data.add(new QuestionData("(48/4)*10=?", "130", "120", "100", "12", "120"));
        data.add(new QuestionData("(83-15 -18) / 2=?", "24", "30", "25", "36", "25"));


        data.add(new QuestionData("(78/13)*8=?", "56", "48", "52", "34", "48"));
        data.add(new QuestionData("(88+12)/25=?", "5", "4", "10", "3", "4"));
        data.add(new QuestionData("(146+78)/2=?", "112", "110", "120", "122", "112"));
        data.add(new QuestionData("(45/3)*5=?", "70", "75", "90", "60", "75"));
        data.add(new QuestionData("63+(13*8)=?", "173", "177", "163", "167", "167"));
        data.add(new QuestionData("98-(144/4)=?", "62", "68", "66", "60", "62"));
        data.add(new QuestionData("(250/10)*3=?", "70", "65", "75", "90", "75"));
        data.add(new QuestionData("(24*4)/3=?", "33", "32", "36", "30", "32"));
        data.add(new QuestionData("(180/2)/(9*10)=?", "0", "1", "90", "45", "1"));
        data.add(new QuestionData("(78-12)/6=?", "10", "12", "11", "9", "11"));


        data.add(new QuestionData("(245/7)/7=?", "5", "7", "6", "15", "5"));
        data.add(new QuestionData("(13*11)+267=?", "410", "436", "400", "490", "410"));
        data.add(new QuestionData("(36*6)/3=?", "62", "84", "72", "82", "72"));
        data.add(new QuestionData("(56*5)*3=?", "770", "870", "850", "840", "840"));
        data.add(new QuestionData("(568/8)-70=?", "11", "1", "10", "0", "1"));
        data.add(new QuestionData("(655/5)*10=?", "1310", "1300", "1315", "1335", "1310"));
        data.add(new QuestionData("(88*7)-271=?", "345", "380", "350", "335", "345"));
        data.add(new QuestionData("(67*8)/4=?", "136", "139", "134", "130", "134"));
        data.add(new QuestionData("(173*5)/(140/28)=?", "170", "175", "174", "173", "173"));
        data.add(new QuestionData("(48*8)/12=?", "30", "28", "32", "34", "32"));


//todo

        data.add(new QuestionData("(78/13)*8=?", "56", "48", "52", "34", "48"));
        data.add(new QuestionData("(88+12)/25=?", "5", "4", "10", "3", "4"));
        data.add(new QuestionData("(146+78)/2=?", "112", "110", "120", "122", "112"));
        data.add(new QuestionData("(45/3)*5=?", "70", "75", "90", "60", "75"));
        data.add(new QuestionData("63+(13*8)=?", "173", "177", "163", "167", "167"));
        data.add(new QuestionData("98-(144/4)=?", "62", "68", "66", "60", "62"));
        data.add(new QuestionData("(250/10)*3=?", "70", "65", "75", "90", "75"));
        data.add(new QuestionData("(24*4)/3=?", "33", "32", "36", "30", "32"));
        data.add(new QuestionData("(180/2)/(9*10)=?", "0", "1", "90", "45", "1"));
        data.add(new QuestionData("(78-12)/6=?", "10", "12", "11", "9", "11"));

//todo
        data.add(new QuestionData("(78/13)*8=?", "56", "48", "52", "34", "48"));
        data.add(new QuestionData("(88+12)/25=?", "5", "4", "10", "3", "4"));
        data.add(new QuestionData("(146+78)/2=?", "112", "110", "120", "122", "112"));
        data.add(new QuestionData("(45/3)*5=?", "70", "75", "90", "60", "75"));
        data.add(new QuestionData("63+(13*8)=?", "173", "177", "163", "167", "167"));
        data.add(new QuestionData("98-(144/4)=?", "62", "68", "66", "60", "62"));
        data.add(new QuestionData("(250/10)*3=?", "70", "65", "75", "90", "75"));
        data.add(new QuestionData("(24*4)/3=?", "33", "32", "36", "30", "32"));
        data.add(new QuestionData("(180/2)/(9*10)=?", "0", "1", "90", "45", "1"));
        data.add(new QuestionData("(78-12)/6=?", "10", "12", "11", "9", "11"));


        data.add(new QuestionData("(256*3)/2=?", "284", "276", "384", "386", "384"));
        data.add(new QuestionData("197*3-512=?", "79", "83", "72", "77", "79"));
        data.add(new QuestionData("866 + (67*12)=?", "1670", "1740", "1815", "1760", "1670"));
        data.add(new QuestionData("(58*6)/12=?", "31", "42", "32", "29", "29"));
        data.add(new QuestionData("(277*7)/1212=?", "767", "814", "727", "746", "727"));
        data.add(new QuestionData("49*8*3", "1176", "1196", "1216", "1186", "1176"));
        data.add(new QuestionData("(1926/18)-100=?", "0", "7", "6", "4", "7"));
        data.add(new QuestionData("(182*13)/14=?", "169", "171", "188", "119", "169"));
        data.add(new QuestionData("(918/27)-34=?", "0", "1", "34", "30", "0"));
        data.add(new QuestionData("(78*19)/6=?", "237", "235", "247", "245", "247"));

    }


    @Override
    public ArrayList<QuestionData> getQuestions() {
        return data;
    }

    @Override
    public QuestionData getQuestionByIndex(int index) {
        return data.get(index);
    }

    @Override
    public ArrayList<QuestionData> getQuestionsByGroup(int index) {
        return data;
    }
}
