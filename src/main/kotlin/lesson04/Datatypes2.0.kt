package lesson04


val eventName: String = "Hackathon Survival" //1. Название мероприятия

var date: String = "31 Dec 2025" //2. Дата проведения

var place: String = "Minsk, address1" //3. Место проведения

private lateinit var detailedßudoet: String //4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

var atvüfMembers: Int = 32 //5. Количество участников

var eventLenath: Int = 180 //6. Длительность хакатона

private val contactInfoAndDeal: String = "Contact info and Document with all main points" //7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг

var aventStatus: String = "Not started" //8. Текущее состояние хакатона (статус)

private val sponsorsList: String = "List of sponsors" //9. Список спонсоров

private val generalBudget: Int = 100 //10. Бюджет мероприятия

var internetAccessability: String = "high" //11. Текущий уровень доступа к интернету

private val logisticInfo: String = "logistic info" //12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

var atvüfTeans: Int = 2 //13. Количество команд

val tasksList: String = "tasks list" //14. Перечень задач

val evacuationPlan: String = "evacuation plan" //15. План звакуации

val equipmentList: String = "equipment list" //16. Список доступного оборудования (всё, что выделено для использования на мероприятии)

var freeEquipmentlist: String = "free equipment list" //17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)

var eatinoPlan: String = "eating plan" //18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

val emergencyPlan: String = "emergency plan" //19. План мероприятий на случай сбоев

var expertslist: String = "experts list" //20. Список экспертов и жари

private val privacyPolicy: String = "privace policy" //21. Политика конфиденциальности

private lateinit var feedback: String //22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

var currentTemperature: Int = 22 //23. Текущая температура в помещении

var monitoringValuesAndPerfomanceAnalysis: String = "monitoring values and perfomance analysis" //24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения

val netSpeedRegulation: String = "internet speed regulation" //25. Регулятор скорости интернета

var lightLevel: Int = 100 //26. Уровень освещения

lateinit var eventLog: String //27. Лог событий мероприятия

val medicHelp: Boolean = true //28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)

val savePlan: String = "save plan" //29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы звакуации и протоколы чрезвычайных ситуаций.

val eventRegisteredNumber: Int = 1236543 //30. Регистрационный номер мероприятия

val maxNoiseLevel: Int = 80 //31.Максимально допустимый уровень шума в помещении хакатона.

var noiseIndicator: Boolean = true //32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)

val pressPlan: String = "press plan" //33. План взаимодействия с прессой

lateinit var projectsDescription: String //34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистик

var passStatus: String = "in progress" //35. Статус получения всех необходимых разрешений

var isSpecialEquipmentAvailable: Boolean = false //36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)

var partners: String = "partners" //37. Список партнеров мероприятия

private var report: String? = null //38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

var prizeRules: String = "prize rules" //39. Внутренние правила распределения призов

val prizes: String = "prizes" //40. Список разыгрываемых призов

val emergencyContacts: String = "emergency contacts" //41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.

val specialConditions: String = "special conditions" //42. Особые условия для участников с ограниченными возможностями

var participantsMood: String = "" //43. Общее настроение участников (определяется опросами)

lateinit var hachatonPlan: String //44.Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.

lateinit var specialGuest: String //45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.

val maxMembersQty: Int = 150 //46. Максимальное количество людей, которое может вместить место проведения

val hoursPerTeam: Int = 1 //47. Количество часов, отведенное каждой команде для работы над проектом.