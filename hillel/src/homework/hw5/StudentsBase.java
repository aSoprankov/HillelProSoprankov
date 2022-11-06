package homework.hw5;

public abstract class StudentsBase {

    public static Student[] createDatabase() {
        Student[] database = new Student[10];

        database[0] = new Student("001", "Simonenko", "Arkadiy", "Sergeyevich",
                "21-10-2002", "Kiev, Teatralna st. 36a", "+38(097)330-22-00", "Sociological",
                "2", "FS-221");
        database[1] = new Student("002", "Evtushenko", "Taras", "Stepanovich",
                "10-05-2001", "Lviv, Kinceva st. 20", "+38(097)346-12-01", "Sociological",
                "3", "FS-320");
        database[2] = new Student("003", "Sidorenko", "Oleg", "Grigorievich",
                "05-12-2000", "Kiev, Shevchenka st. 3a", "+38(097)202-12-78", "Sociological",
                "4", "FS-419");
        database[3] = new Student("004", "Ivanenko", "Sergey", "Antonovich",
                "01-01-2003", "Lviv, Ulichnaya st. 15", "+38(097)822-87-12", "Sociological",
                "1", "FS-221");
        database[4] = new Student("005", "Sidorenko", "Vladimir", "Igorevich",
                "10-03-2002", "Chernihiv, Berezneva st. 20a", "+38(097)756-21-12", "Sociological",
                "2", "FS-221");
        database[5] = new Student("006", "Ignatenko", "Dmitriy", "Vladimirovich",
                "01-03-2002", "Dnepr, Centralna st. 65", "+38(097)350-88-20", "Philological",
                "2", "FP-221");
        database[6] = new Student("007", "Kirichenko", "Inna", "Ivanovna",
                "07-06-2003", "Kiev, Amosova st. 1a", "+38(097)967-11-12", "Philological",
                "1", "FP-121");
        database[7] = new Student("008", "Simonenko", "Stepan", "Stepanovich",
                "30-09-2002", "Chernihiv, Udachnaya st. 5", "+38(097)786-12-10", "Philological",
                "2", "FP-221");
        database[8] = new Student("009", "Kirilenko", "Yulia", "Sergeyevna",
                "19-11-2000", "Dnepr, Praktuchna st. 15", "+38(097)752-12-30", "Philological",
                "4", "FP-419");
        database[9] = new Student("010", "Evtushko", "Mariya", "Petrovna",
                "21-04-2001", "Kiev, Kirova st. 7b", "+38(097)004-07-43", "Philological",
                "3", "FP-321");

        return database;
    }
}
