package other_resources._11_oop.inner_class

fun main() {
    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))
    listView.ListViewItem().displayItem(3)
}

class ListView(val items: Array<String>) {

    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}