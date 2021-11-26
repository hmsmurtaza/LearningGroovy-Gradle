// tasks.register("hello") {
//     doLast{
//         println("Hello world!")
//     }
// }

// tasks.register("upper"){
//     doLast{
//         val something = "HMShoaibMurtaza"
//         println("Original: $something")
//         println("Upper case: ${something.toLowerCase()}")
//     }
// }

// tasks.register("count") {
//     doLast{
//         repeat(4) {print("$it ")}
//     }
// }

///////////Task dependencies////////////////////////////////////
tasks.register("hello") {
    doLast{
        println("Hello world!")
    }
}
tasks.register("intro") {
    dependsOn("hello")
    doLast{
        println("I'm Gradle")
    }
}
//////////End Task dependencies/////////////////////////////////////////////////