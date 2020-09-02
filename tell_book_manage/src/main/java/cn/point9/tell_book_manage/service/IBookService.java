package cn.point9.tell_book_manage.service;

import cn.point9.tell_book_manage.entity.Book;
import cn.point9.tell_book_manage.pojo.req.BookReq;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Point9
 * @since 2019-09-24
 */
public interface IBookService extends IService<Book> {

    IPage<Book> queryBookListByPage(BookReq bookReq);
}
