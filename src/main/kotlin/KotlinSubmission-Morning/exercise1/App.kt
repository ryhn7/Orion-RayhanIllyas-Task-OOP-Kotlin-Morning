package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1 Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah
 * ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak) Dan Cetak
 * setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var firstName: String = "Rayhan"
    var lastName: String = "Annabil"
    var age: Number = 21
    var isSingle: Boolean = false
    return println(
            "FirstName = $firstName\nLastName = $lastName\nAge = $age\nisSingle = $isSingle"
    )
}

/**
 * Latihan 2 Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang
 * ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("========= The Orion =========")
    println("Group id: $groupId")
    println("Group member: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3 Buat variable yang berisi daftar anggota group kamu, Kemudian akses item yang berisi
 * nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    var teamOrion =
            listOf(
                    "Astrid",
                    "Cahya",
                    "Fatima",
                    "Febri",
                    "Fikry",
                    "Ikram",
                    "Nurul",
                    "Rayhan",
                    "Reynaldi",
                    "Rifqi",
                    "Zahra",
                    "Orion"
            )

    return listOf(teamOrion[7])
}

fun myTeamAlt(): List<Any> {
    var teamOrion =
            listOf(
                    "Astrid",
                    "Cahya",
                    "Fatima",
                    "Febri",
                    "Fikry",
                    "Ikram",
                    "Nurul",
                    "Rayhan",
                    "Reynaldi",
                    "Rifqi",
                    "Zahra",
                    "Orion"
            )

    return teamOrion
}

/**
 * Latihan 4 Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * ```
 *      total mentor + jumlah anggota group
 * ```
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Kelvin", "Kak Shania", "Kak Iffan")
    val countOfGroup =
            arrayOf<String>(
                    "Astrid",
                    "Cahya",
                    "Fatima",
                    "Febri",
                    "Fikry",
                    "Ikram",
                    "Nurul",
                    "Rayhan",
                    "Reynaldi",
                    "Rifqi",
                    "Zahra"
            )
    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()
    println()

    val myTeam = myTeam()
    println("My team is: $myTeam")
    println()

    val myTeamName = myTeamAlt()
    println("My team name is: ${myTeamName[11]}")
    println()


    val totalMember = totalMember()
    println("Total Member group : $totalMember")
    println()

    /**
     * Latihan 5 Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data
     * group kamu
     */
    val groupID = "03"
    val groupMember = myTeamAlt()
    val session = "Morning"
    groupDetail(groupID, groupMember, session)

}
