package own.solid.single_responsibility.violation_example

import own.solid.single_responsibility.User

/**
 * @author : LEX_YU
 * Change may easily affect theoretically unrelated business functions.
 */
class AdminDashboardService {
    /**
     * would be responsible
     * 1. for preparing an HTML content for the email
     * 2. and sending it to the given email address
     */
    fun sendNotification(user: User) {
        println("Preparing email content")
        println("Sending email to ${user.email}")
    }

    /**
     * 3. would perform an SQL query deleting the record from connected database.
     */
    fun deleteUser(user: User) {
        println("Deleting user with id ${user.id} from the database")
    }
}
