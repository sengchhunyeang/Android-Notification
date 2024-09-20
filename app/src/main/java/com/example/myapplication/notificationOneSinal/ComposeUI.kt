//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import androidx.compose.material3.Text
//
//@Composable
//fun MyApp() {
//    val navController = rememberNavController()
//
//
//    // Handle navigation based on notification data
//    LaunchedEffect(NotificationHandler.targetScreen) {
//        NotificationHandler.targetScreen?.let { targetScreen ->
//            when (targetScreen) {
//                "Profile" -> {
//                    navController.navigate("profile") {
//                        // Optionally, clear the back stack
//                        popUpTo("home") { inclusive = true }
//                    }
//                    // Clear the notification target screen
//                    NotificationHandler.targetScreen = null
//                }
//                // Handle other target screens if needed
//            }
//        }
//    }
//
//    NavHost(navController = navController, startDestination = "home") {
//        composable("home") { HomeScreen(navController) }
//        composable("profile") { ProfileScreen(navController) }
//        // Add more destinations as needed
//    }
//}
//
//
//@Composable
//fun HomeScreen(navController: NavHostController) {
//    Text(text = "Home Screen")
//    // Add navigation logic if needed
//}
//
//@Composable
//fun ProfileScreen(navController: NavHostController) {
//    Text(text = "Profile Screen")
//    // Add UI and navigation logic if needed
//}
