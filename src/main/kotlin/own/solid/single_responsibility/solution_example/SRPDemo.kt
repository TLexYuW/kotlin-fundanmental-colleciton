package own.solid.single_responsibility.solution_example

/**
 * @author : LEX_YU
 * Each class is responsible for exactly one thing
 */

/**
 * 3. would perform an SQL query deleting the record from connected database.
 */
class UserAccountService {
    fun deleteUser(){}
}

/**
 * 1. for preparing an HTML content for the email
 */
class EmailContentProvider {
    fun prepareContent(){}
}

/**
 *  2. sending it to the given email address
 */
class EmailNotificationService {
    fun sendNotification(){}
}
