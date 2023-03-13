package uz.abbosbek.fragmentdialogs.utils

import uz.abbosbek.fragmentdialogs.models.User

object MyData {
    val listTariffs = ArrayList<User>()
    val listInternet = ArrayList<User>()
    val listSMS = ArrayList<User>()
    val listMinutes = ArrayList<User>()
    val listService = ArrayList<User>()


    fun addTemple(){
        for (i in 0 until 5){
            listTariffs.add(User("Mobi 20", "*171*116*$i#","${i}600", "MOBIUZ abonentlariga, O'zbekistonning boshqa mobil operatorlari abonentlariga,Shahar raqamlariga chiquvchi qo'ng'iroqlarga (oyiga/kuniga). 2 000/67 MB"))
            listTariffs.add(User("Mobi 25", "*171*116*$i#", "${i+1}000", "Hususan, “Mobi 25” bo'yicha 3 500 MB, O'zbekiston bo'yicha qo'ng'iroqlar uchun 750 daqiqa va 750 ta SMS-xabar kiradi. “Mobi 30+” abonent to'lovi doirasida 5 000"))
            listTariffs.add(User("Mobi 30", "*171*116*${i+2}#", "${i+2}000", "Mobi 30+. 30 000/1500 . so'm. Abonent to'lovi oyiga/kuniga. Tanlash. 5000/167 daqiqa. MOBIUZ abonentlariga , O'zbekistonning boshqa mobil operatorlari va"))
            listTariffs.add(User("Mobi 40", "*171*116$i*$i#", "${i+3}000", "Mobi 40. 40 000/2 000 so'm. Abonent to'lovi oyiga/kuniga. Tanlash. UNLIM. Mobiuz tarmog'i ichidagi qo'ng'iroqlarga. 5 000/167 daqiqa (oyiga/kuniga)"))
            listTariffs.add(User("Mobi 50", "*171*116*${i+1}#", "${i+4}000", "Mobi 50+. 50 000/2500 so'm. Abonent to'lovi oyiga/kuniga. Tanlash. UNLIM. Mobiuz tarmog'i ichidagi qo'ng'iroqlarga. 5000/167 daqiqa."))
        }

        for (i in 0 until 5){
            listInternet.add(User("300 MB", "*171*${i}#", "${i+7}000 sum", "Talaba · Talaba+ · Maktab · Fidokor · Fidokor+ · «Mobiuz bilan birga» · O'qituvchi 2 · O'qituvchi 1 · FAXRIY ... 300 MB. 300 MB. 8 000 so'm. 30 kunga"))
            listInternet.add(User("500 MB", "*171*${i+1}#", "${i+8}000 sum", "Foydalanuvchi Mobiuz mobil ilovasida birinchi marta ro'yxatdan o'tganda, 500 MB bonusli to'plamini ulashi mumkinligini, ma'lum qilishdan mamnunmiz! 30 kunga"))
            listInternet.add(User("1000 MB", "*171*${i+2}#", "${i+10}000 sum", "«Ulanganlik uchun bonus – 1000 MB, 500 daqiqa, 500 SMS» aksiyasi ... Mobiuz ning Corporate Perfect, Corporate Ultra, Corporate Maxi, Corporate 777 tarif"))
            listInternet.add(User("2000 MB", "*171*${i+3}#", "${i+19}000 sum", "2000 MB. 2000 MB. 17 000 so'm. Faollashtirish. © 2023 MCHJ «UMS». Barcha huquqlar himoya qilingan. Abonentlarga · Korporativ abonentlarga · Kompaniya haqida  30 kunga"))
            listInternet.add(User("10 000 MB", "*171*${i+4}#", "${i+49}000 sum", "Kiritilgan megabaytlar to'plami: oyiga 10 000 MB;. Kiritilgan SMS-xabarlar to'plami: oyiga 3 500 SMS;. Mobiuz tarmog'i ichida UNLIM daqiqalar va boshqa 30 kunga"))
        }

        for (i in 0 until 5){
            listSMS.add(User("100 SMS", "*171*${i}00#", "4 500 sum", "Переход на ТП «Gap Yo'q Ultra». USSD-команда - *111*105#; SMS-помощник - цифра 1 на 616105 · Gap Yo'q Ultra · 100 000/5 000 сум ; Переход на ТП «Mobi 20 Годовой» 30 hunga"))
            listSMS.add(User("300 SMS", "*171*${i}00#", "4$i 500 sum", "Переход на ТП «Gap Yo'q Ultra». USSD-команда - *111*105#; SMS-помощник - цифра 1 на 616105 · Gap Yo'q Ultra · 100 000/5 000 сум ; Переход на ТП «Mobi 20 Годовой» 30 hunga"))
            listSMS.add(User("1 000 SMS", "*171*${i}00#", "4${i+1} 500 sum", "Переход на ТП «Gap Yo'q Ultra». USSD-команда - *111*105#; SMS-помощник - цифра 1 на 616105 · Gap Yo'q Ultra · 100 000/5 000 сум ; Переход на ТП «Mobi 20 Годовой» 30 hunga"))
            listSMS.add(User("2 000 SMS", "*171*${i}00#", "4${i+2} 500 sum", "Переход на ТП «Gap Yo'q Ultra». USSD-команда - *111*105#; SMS-помощник - цифра 1 на 616105 · Gap Yo'q Ultra · 100 000/5 000 сум ; Переход на ТП «Mobi 20 Годовой» 30 hunga"))
            listSMS.add(User("10 000 SMS", "*171*${i}00#", "4${i+3} 500 sum", "Переход на ТП «Gap Yo'q Ultra». USSD-команда - *111*105#; SMS-помощник - цифра 1 на 616105 · Gap Yo'q Ultra · 100 000/5 000 сум ; Переход на ТП «Mobi 20 Годовой» 30 hunga"))
        }

        for (i in 0 until 5){
            listMinutes.add(User("60 daqiqa", "*171*${i}00#", "4${i} 000 sum", "Daqiqalar to'plami har oyning xizmat ulangan kunida taqdim etiladi. Mobiuz tarmog'i ichidagi chiquvchi qo'ng'iroqlarga berilgan 15000 daqiqa ulangan paytdan 30 kunga"))
            listMinutes.add(User("${i+1}60 daqiqa", "*171*${i}00#", "4${i+0} 000 sum", "Daqiqalar to'plami har oyning xizmat ulangan kunida taqdim etiladi. Mobiuz tarmog'i ichidagi chiquvchi qo'ng'iroqlarga berilgan 15000 daqiqa ulangan paytdan 30 kunga"))
            listMinutes.add(User("${i+2}60 daqiqa", "*171*${i}00#", "4${i+0} 000 sum", "Daqiqalar to'plami har oyning xizmat ulangan kunida taqdim etiladi. Mobiuz tarmog'i ichidagi chiquvchi qo'ng'iroqlarga berilgan 15000 daqiqa ulangan paytdan 30 kunga"))
            listMinutes.add(User("${i+3}60 daqiqa", "*171*${i}00#", "4${i+2} 000 sum", "Daqiqalar to'plami har oyning xizmat ulangan kunida taqdim etiladi. Mobiuz tarmog'i ichidagi chiquvchi qo'ng'iroqlarga berilgan 15000 daqiqa ulangan paytdan 30 kunga"))
        }
        for (i in 0 until 5){
            listService.add(User("Sizga qo'ng'iroq qilishdi", "*111*0131#","1 yildan so'ng bepul","O'tkazib yuborilgan qo'ng'iroqlarni sizga yatkazadi"))
            listService.add(User("4G LTE", "*222*0131#","1 yildan so'ng bepul","O'tkazib yuborilgan qo'ng'iroqlarni sizga yatkazadi"))
            listService.add(User("Supper gap ko'p", "*111*0101#","1 yildan so'ng bepul","O'tkazib yuborilgan qo'ng'iroqlarni sizga yatkazadi"))
            listService.add(User("Antiaon", "*111*0101#","500 sum kuniga","Raqamingizni aniqlashga qarshilik hizmati"))
        }
    }
}