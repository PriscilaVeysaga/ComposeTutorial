package com.example.composetutorial

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message(
            "User",
            "Hello! How can I help you?"
        ),
        Message(
            "Colleague",
            "Hi! I have a question about Android development."
        ),
        Message(
            "User",
            "Sure, I'd be happy to help. What do you need to know?"
        ),
        Message(
            "Colleague",
            "I'm wondering about the latest Android versions and their features."
        ),
        Message(
            "User",
            "Here's a list of some recent Android versions:\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n" +
                    "Each version comes with its own set of features and improvements."
        ),
        Message(
            "Colleague",
            "That's helpful, thanks! I've also heard a lot about Kotlin. What do you think of it?"
        ),
        Message(
            "User",
            "Kotlin is a fantastic language! It's concise, expressive, and interoperable with Java. " +
                    "Many Android developers prefer it for its modern features and reduced boilerplate code."
        ),
        Message(
            "Colleague",
            "I'll definitely give it a try. And what about Jetpack Compose?"
        ),
        Message(
            "User",
            "Jetpack Compose is a modern UI toolkit for building native Android UIs. " +
                    "It's designed to make UI development easier and more efficient. You should definitely check it out!"
        ),
        Message(
            "Colleague",
            "Sounds great! I'll explore both Kotlin and Jetpack Compose. Thanks for the advice!"
        ),
        Message(
            "User",
            "You're welcome! If you have any more questions, feel free to ask."
        )
    )
}
