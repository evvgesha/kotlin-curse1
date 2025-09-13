package com.example.kotlincourse.lessons.lesson3

const val name = "katanafest"

class katanafest {
    var data: String = "27.09"
    val pleace: String = "ДК мир"
    val actors: String by lazy {
                "интерактивы t.me/mill_lee - 5000" +
                "лектор Анна Буландо́ - 5000" +
                "фотограф  @vielplum - 5000" +
                "ведущая t.me/mirasolcos_play - 5000" +
                "ведушая 2.0 t.me/ufosongs - 5000" +
                "концертная программа vk.com/senpoliyagroup - 5000" +
                "конццертная программа 2.0 t.me/ amanogawa_jp - 5000"
    }
    private val equipment: String by lazy {
    "звук и освещение на сцене - 5000" +
            "фотозона - 4000" +
            "буфет - 20000" +
            "постеры и плакаты - 2000" +
            "доставка оборудования - 8000"
}

    var person: Int = 279
    private val hacaton: Double = 3.7
    private var statyshacaton: String = "готов"
    val sponsors: String by lazy {
        "redbull" +
                "pepsi" +
                "FIFA.com" +
                "KIA MOTORS"
    }
    private val budget: Int = 100000

    var internet: Boolean = true

    private val car: String by lazy {
        "car1 из ул.Дружбы д.83 до ДК мир" +
                "car2 из пр.Боголюбова д.5 до ДК мир" +
                "car3 из ул.Понтекорово д.32 до ДК мир"
    }
    private val resources: String by lazy {
    "car1 перенести ресурсы в прихожую" +
            "car2 перенести ресурсы в зал" +
            "car3 перенести ресурсы в гримерку"
}
    private val supportteam: String by lazy {
       "support teams1 отвечает за установку ресурсов из car3" +
               "support teams2 отвечает за установку ресурсов из car1" +
               "support teams3 отвечает за установку ресурсов из car2"
   }
    private val supportteam1: Int = 3
    private val supportteam2: String by lazy {
        "установить декорации для support teams1 в гримерке" +
                "установить декорации для support teams2 в прихожей" +
                "установить декорации для support teams3 в зале"
    }
    val Evacuationplan: String by lazy {
        "организаторам показывать на правдение движения" +
                "участникам следовать указания организаторов" +
                "следовать в по указаниям системы оповещения"
    }
    private val Listofequipment: String by lazy {
        "звук и освещение на сцене " +
                "фотозона " +
                "буфет " +
                "постеры и плакаты "
    }
    private val freeequipment: String by lazy {
        "постеры и плакаты " +
                "фотозона "
    }
    val Powersupply: Double = 14.30

    private val failure: String = "взять запасной пк"

    val jury: String by lazy {
        "ведущая t.me/mirasolcos_play - 5000" +
                "ведушая 2.0 t.me/ufosongs - 5000"
    }
    val rules: String = "Абсолютно все они обязательны. Советуем каждому ознакомиться с правилами и соблюдать их"

    private val reviews: String = "Думаю не ошибусь по поводу того, что в вашем мягко говоря не самом теплом в климатическом отношении городе в день феста ожидается ЖАРИЩА в самом лучшем смысле этого слова"

    var temperature: Int = 22

    private val Internetconnections: String by lazy {
        "ping = 43" +
                "90 Мбит/с" +
                "ms - 9"
    }

    private var ISC: Double = 0.7

    var Lightinglevel: Int = 150

    val events: String by lazy {
        "сбор" +
                "знакомство" +
                "концерт" +
                "фотозона" +
                "конец"
    }
    val medicine: Boolean = true

    val dangers: String by lazy {
        "проверка при входе" +
                "гос.служашие на территории" +
                "правила по косплею (запрет металических орудий, даже как часть кастюма)"
    }
    val Registrationnumber: Double = 05.12/204

    val Noiseleves: Int = 53

    var Noiselevel: Boolean = false

    private val press: String by lazy {
        "сбор" +
                "повествование о мероприятии" +
                " вопросы"
    }



    var permissions: Boolean = true

    // дальше будет без подробностей

    val partners: String by lazy {
        "клаустрафоб" +
                "мастер по педикюру" +
                "педиатор"
    }

    lateinit var media: String

    private val rule: String by lazy {
        "привила "
    }
    private val prizz: String by lazy {
        "приз" +
                "приз" +
                "приз"
    }
    private val number: String by lazy {
        "номер служб" +
                "медицинский номер" +
                "другие важные службы"
    }
    private val rules1: String by lazy {
        "не падать" +
                "не прыгать"
    }
    var emogi: Int = 10 // из десяти

    private val plan: String by lazy {
        "время" +
                "всякое такое "
    }
    lateinit var guest: String

    var goest: Int = 0
        get() {
            return if (field > 300) field else 0
        }

    var time: Int = 14
}