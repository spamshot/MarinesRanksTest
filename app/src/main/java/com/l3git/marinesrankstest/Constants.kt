package com.l3git.marinesrankstest

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What rank is this?",
            R.drawable.a,
            "Private",
            "Lance Corporal",
            "Private First Class",
            "Corporal",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What rank is this?",R.drawable.b,
            "Sergeant",
            "Lance Corporal",
            "Corporal",
            "Private",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What rank is this?",R.drawable.c,
            "Staff Sergeant",
            "Sergeant",
            "Captain",
            "Corporal",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What rank is this?",R.drawable.d,
            "Sergeant",
            "Staff Sergeant",
            "First Sergeant",
            "Gunnery Sergeant",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What rank is this?",R.drawable.e,
            "Master Gunnery Sergeant",
            "Staff Sergeant",
            "Gunnery Sergeant",
            "First Sergeant",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What rank is this?",R.drawable.f,
            "Sergeant Major",
            "Master Sergeant",
            "Master Gunnery Sergeant",
            "Gunnery Sergeant",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What rank is this?",R.drawable.g,
            "First Sergeant",
            "Sergeant",
            "Sergeant Major",
            "Staff Sergeant",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What rank is this?", R.drawable.h,
            "Master Gunnery Sergeant",
            "Staff Sergeant",
            "Master Sergeant",
            "Sergeant Major",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What rank is this?",R.drawable.i,
            "First Sergeant",
            "Sergeant Major of the Marine Corps",
            "Sergeant Major",
            "Staff Sergeant",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What rank is this?",R.drawable.k,
            "Gunnery Sergeant",
            "Corporal",
            "Master Sergeant",
            "Master Gunnery Sergeant",
            4
        )
        questionsList.add(que10)

        val que11 = Question(
            11,"What rank is this?",R.drawable.j,
            "Warrant Officer",
            "Sergeant Major of the Marine Corps",
            "Chief Warrant Officer 2",
            "Sergeant Major",
            2
        )
        questionsList.add(que11)

        val que12 = Question(
            12,"What rank is this?",R.drawable.w1,
            "Chief Warrant Officer 2",
            "Warrant Officer",
            "First Lieutenant",
            "Chief Warrant Officer 5",
            2
        )
        questionsList.add(que12)

        val que13 = Question(
            13,"What rank is this?",R.drawable.w2,
            "Second Lieutenant",
            "Chief Warrant Officer 3",
            "Chief Warrant Officer 5",
            "Chief Warrant Officer 2",
            4
        )
        questionsList.add(que13)

        val que14 = Question(
            14,"What rank is this?",R.drawable.w3,
            "Chief Warrant Officer 3",
            "Second Lieutenant",
            "Chief Warrant Officer 2",
            "Warrant Officer",
            1
        )
        questionsList.add(que14)

        val que15 = Question(
            15,"What rank is this?",R.drawable.w4,
            "Chief Warrant Officer 4",
            "Warrant Officer",
            "Chief Warrant Officer 2",
            "Chief Warrant Officer 5",
            1
        )
        questionsList.add(que15)

        val que16 = Question(
            16,"What rank is this?",R.drawable.w5,
            "Chief Warrant Officer 2",
            "Chief Warrant Officer 5",
            "Warrant Officer",
            "Colonel",
            2
        )
        questionsList.add(que16)

        val que17 = Question(
            17,"What rank is this?",R.drawable.l,
            "First Lieutenant",
            "Lieutenant Colonel",
            "Second Lieutenant",
            "Colonel",
            3
        )
        questionsList.add(que17)

        val que18 = Question(
            18,"What rank is this?",R.drawable.m,
            "Lieutenant Colonel",
            "Second Lieutenant",
            "Captain",
            "First Lieutenant",
            4
        )
        questionsList.add(que18)

        val que19 = Question(
            19,"What rank is this?",R.drawable.n,
            "Captain",
            "Major",
            "Lieutenant Colonel",
            "Warrant Officer",
            1
        )
        questionsList.add(que19)

        val que20 = Question(
            20,"What rank is this?",R.drawable.o,
            "First Lieutenant",
            "Major",
            "Lieutenant Colonel",
            "Sergeant Major of the Marine Corps",
            2
        )
        questionsList.add(que20)

        val que21 = Question(
            21,"What rank is this?",R.drawable.p,
            "Major",
            "Captain",
            "Brigadier General",
            "Lieutenant Colonel",
            4
        )
        questionsList.add(que21)

        val que22 = Question(
            22,"What rank is this?",R.drawable.q,
            "Lieutenant Colonel",
            "Colonel",
            "Second Lieutenant",
            "Lieutenant General",
            2
        )
        questionsList.add(que22)

        val que23 = Question(
            23,"What rank is this?",R.drawable.r,
            "Brigadier General",
            "Major General",
            "General",
            "Lieutenant General",
            1
        )
        questionsList.add(que23)

        val que24 = Question(
            24,"What rank is this?",R.drawable.s,
            "Lieutenant Colonel",
            "Lieutenant General",
            "Major General",
            "General",
            3
        )
        questionsList.add(que24)


        val que25 = Question(
            25,"What rank is this?",R.drawable.t,
            "Brigadier General",
            "Major General",
            "Major",
            "Lieutenant General",
            4
        )
        questionsList.add(que25)

        val que26 = Question(
            26,"What rank is this?",R.drawable.u,
            "Lieutenant General",
            "General",
            "Major General",
            "Brigadier General",
            2
        )
        questionsList.add(que26)

        return  questionsList
    }



    fun getFacts(): ArrayList<Fact>{
        val factList = ArrayList<Fact>()

        val fac1 = Fact(1,"Marine recruits must finish eating the moment their drill instructor is finished")
        factList.add(fac1)

        val fac2 = Fact(2,"Six U.S. presidents served in the US Navy during WWII")
        factList.add(fac2)

        val fac3 = Fact(3,"The Marines first battle took place in the Bahamas")
        factList.add(fac3)

        val fac4 = Fact(4,"On Sept. 25, 1942, President Franklin D. Roosevelt officially dedicated Marine Corps Base Camp Pendleton")
        factList.add(fac4)

        val fac5 = Fact(5,"The Marine Corps is technically a part of the U.S. Navy, ever since Congress placed the Marines under the Navy in 1834")
        factList.add(fac5)

        val fac6 = Fact(6,"The Marines first won fame for fighting pirates")
        factList.add(fac6)

        val fac7 = Fact(7,"The U.S. Marine Corps was formed on November 10th 1775 as a ground force of the Navy")
        factList.add(fac7)

        val fac8 = Fact(8,"The license plate of the Commandant of the Marine Corps reads  1775")
        factList.add(fac8)

        val fac9 = Fact(9,"The Marine Corps mascot is an English bulldog named Chesty")
        factList.add(fac9)

        val fac10 = Fact(10,"Ever since Vietnam, Marine Amtrac crews will not eat apricots, as they’re considered bad luck")
        factList.add(fac10)

        val fac11 = Fact(11,"Marines are often called jarheads because of their high-and-tight haircuts")
        factList.add(fac11)

        val fac12 = Fact(12,"The U.S. Marine Corps has been an official component of the U.S. Navy since June 1834")
        factList.add(fac12)

        val fac13 = Fact(13,"The Marine section of the Navy flying school was established in January 1914")
        factList.add(fac13)

        val fac14 = Fact(14,"Tun Tavern is traditionally regarded as the site where what became the United States Marine Corps held its first recruitment drive during the American Revolution")
        factList.add(fac14)

        val fac15 = Fact(15,"Semper Fidelis or Semper Fi is a Latin phrase that means \"always faithful\" or \"always loyal\"")
        factList.add(fac15)

        val fac16 = Fact(16,"General David H. Berger is the current Commandant of the Marine Corps")
        factList.add(fac16)

        val fac17 = Fact(17,"You must learn all Eleven General Orders of a Sentry")
        factList.add(fac17)

        val fac18 = Fact(18,"John F. Kennedy is the only U.S. president to earn a Purple Heart, while serving in the Navy during World War II")
        factList.add(fac18)

        val fac19 = Fact(19,"Follow the FBI guide line and visit the U.S. Holocaust Memorial Museum in Washington, D.C. to see in horrific detail what can happen when law enforcement loses sight of what is right.")
        factList.add(fac19)

        val fac20 = Fact(20,"Marines guard Embassies around the world")
        factList.add(fac20)

        val fac21 = Fact(21,"George Washington was the father of the Navy")
        factList.add(fac21)

        val fac22 = Fact(22,"The quatrefoil was worn on the caps of Marines fighting on the decks of ships to be easily recognized by the Marine sharpshooters located above in the ship's rigging")
        factList.add(fac22)


        return factList
    }

}