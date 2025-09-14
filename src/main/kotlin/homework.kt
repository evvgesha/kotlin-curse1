package com.example.kotlincourse.lessons.lesson3

const val name = "katanafest" //1

class katanafest {
    var data: String = "27.09"//2
    var pleace: String = "ДК мир"//3
    val actors: String by lazy {  //4
                "интерактивы t.me/mill_lee - 5000" +
                "лектор Анна Буландо́ - 5000" +
                "фотограф  @vielplum - 5000" +
                "ведущая t.me/mirasolcos_play - 5000" +
                "ведушая 2.0 t.me/ufosongs - 5000" +
                "концертная программа vk.com/senpoliyagroup - 5000" +
                "конццертная программа 2.0 t.me/ amanogawa_jp - 5000"
    }
    private val equipment: String by lazy {  //5
    "звук и освещение на сцене - 5000" +
            "фотозона - 4000" +
            "буфет - 20000" +
            "постеры и плакаты - 2000" +
            "доставка оборудования - 8000"
}

    var person: Int = 0 //6
    private val hacaton: Double = 3.7//7
    private var statyshacaton: String = "готов"//8
    val sponsors: String by lazy {//9
        "redbull" +
                "pepsi" +
                "FIFA.com" +
                "KIA MOTORS"
    }
    private val budget: Int = 100000//10

    var internet: Boolean = true//11

    private val car: String by lazy {//12
        "car1 из ул.Дружбы д.83 до ДК мир" +
                "car2 из пр.Боголюбова д.5 до ДК мир" +
                "car3 из ул.Понтекорово д.32 до ДК мир"
    }
    private val resources: String by lazy {//13
    "car1 перенести ресурсы в прихожую" +
            "car2 перенести ресурсы в зал" +
            "car3 перенести ресурсы в гримерку"
}
    private val supportteam: String by lazy {//14
       "support teams1 отвечает за установку ресурсов из car3" +
               "support teams2 отвечает за установку ресурсов из car1" +
               "support teams3 отвечает за установку ресурсов из car2"
   }
    private val supportteam1: Int = 3//15
    private val supportteam2: String by lazy {//16
        "установить декорации для support teams1 в гримерке" +
                "установить декорации для support teams2 в прихожей" +
                "установить декорации для support teams3 в зале"
    }
    val Evacuationplan: String by lazy {//17
        "организаторам показывать на правдение движения" +
                "участникам следовать указания организаторов" +
                "следовать в по указаниям системы оповещения"
    }
    private val Listofequipment: String by lazy {//18
        "звук и освещение на сцене " +
                "фотозона " +
                "буфет " +
                "постеры и плакаты "
    }
    private val freeequipment: String by lazy {//19
        "постеры и плакаты " +
                "фотозона "
    }
    val Powersupply: Double = 14.30//20

    private val failure: String = "взять запасной пк"//21

    val jury: String by lazy {//22
        "ведущая t.me/mirasolcos_play - 5000" +
                "ведушая 2.0 t.me/ufosongs - 5000"
    }
    val rules: String = "Абсолютно все они обязательны. Советуем каждому ознакомиться с правилами и соблюдать их"//23

    private val reviews: String = "Думаю не ошибусь по поводу того, что в вашем мягко говоря не самом теплом в климатическом отношении городе в день феста ожидается ЖАРИЩА в самом лучшем смысле этого слова"
//24
    var temperature: Int = 22//25

    private val Internetconnections: String by lazy {//26
        "ping = 43" +
                "90 Мбит/с" +
                "ms - 9"
    }

    private var ISC: Double = 0.7//28

    var Lightinglevel: Int = 150//29

    val events: String by lazy {//30
        "сбор" +
                "знакомство" +
                "концерт" +
                "фотозона" +
                "конец"
    }
    val medicine: Boolean = true//31

    val dangers: String by lazy {//32
        "проверка при входе" +
                "гос.служашие на территории" +
                "правила по косплею (запрет металических орудий, даже как часть кастюма)"
    }
    val Registrationnumber: Double = 05.12/204//33

    val Noiseleves: Int = 53//34

    var Noiselevel: Boolean = false//35

    private val press: String by lazy {//36
        "сбор" +
                "повествование о мероприятии" +
                " вопросы"
    }



    var permissions: Boolean = true//37

    // дальше будет без подробностей

    val partners: String by lazy {//38
        "клаустрафоб" +
                "мастер по педикюру" +
                "педиатор"
    }

    lateinit var media: String//39

    private val rule: String by lazy {//40
        "привила "
    }
    private val prizz: String by lazy {//41
        "приз" +
                "приз" +
                "приз"
    }
    private val number: String by lazy {//42
        "номер служб" +
                "медицинский номер" +
                "другие важные службы"
    }
    private val rules1: String by lazy {//43
        "не падать" +
                "не прыгать"
    }
    var emogi: Int = 10 //44

    private val plan: String by lazy {//45
        "время" +
                "всякое такое "
    }
    lateinit var guest: String//46

    var goest: Int = 0//47
        get() {
            return if (field > 300) field else 0
        }

    var time: Int = 14//47
}