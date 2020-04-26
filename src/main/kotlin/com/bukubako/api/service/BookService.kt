package com.bukubako.api.service

import com.bukubako.api.domain.Book
import org.springframework.stereotype.Service

@Service
class BookService {

    fun get(id: String): Book =
            Book("夏目漱石 思想の比較と未知の探究",
                    listOf("宮本盛太郎", "関静雄"),
                    "未知の装石像とその周辺事実に迫る",
                    "2000-02",
                    "http://books.google.com/books/content?id=l-cqAQAAIAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api")
}
