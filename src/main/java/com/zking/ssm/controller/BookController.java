package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.model.BookType;
import com.zking.ssm.model.Module;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.service.IModuleService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService IBookService;
    @Autowired
    private IModuleService IModuleService;
    @ModelAttribute
    public  void init(Model model){
        List<BookType> list = new ArrayList<BookType>();
        list.add(new BookType("漫画","漫画"));
        list.add(new BookType("武侠","武侠"));
        list.add(new BookType("计算机","计算机"));
        model.addAttribute("btype",list);
    }
    //业务跳转(跳转页面)
    @RequestMapping("/toAddBook")
    public String toAdd(Model model){
        Book book=new Book();
        model.addAttribute("book",book);
        return "book/addBook";
    }


    //业务处理(查询用forward转发、增删改用redirect重定向)
    @RequestMapping("/addBook")
    public String addBook(Book book, RedirectAttributes model){
        int insert=IBookService.insert(book);
        if (insert>0)
            model.addAttribute("message","书本添加成功");
        else
            model.addAttribute("message","书本添加失败");
        return "redirect:toAddBook";
    }
    //    跳转页面
    @RequestMapping("/bookList")
    @ResponseBody
    public Map<String,Object> toBookList(){
        PageBean pageBean = new PageBean();
       // pageBean.setRequest(req);
        Module module=new Module();
        module.setPid("-1");
        List<Module> maps = IModuleService.queryModuleTree(module);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows",maps);
        map.put("total",pageBean.getTotal());
        return map;
    }
    @RequestMapping("/toFileUpload")
    public String toBookFileUpload(@RequestParam String id,Model model){
        model.addAttribute("bookId",id);
        return "book/bookUpload";
    }

    //    跳转页面
    @RequestMapping("/toIndex")
    @ResponseBody
    public List<Map<String, Object>> toIndex(){
            Module module=new Module();
            module.setPid("-1");
        List<Module> maps = IModuleService.queryModuleTree(module);
        List<Map<String, Object>> wu = transitionTreeGrid(maps, "-1");
        System.out.println(wu);
        return wu;
    }

    public List<Map<String, Object>> transitionTreeGrid(List<Module> list, String id) {
        System.out.println("进来了么");
        if (null == id || null == list || 0 == list.size())
            return null;
        List<Map<String, Object>> tree = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (Module module : list) {
            if (id.equals(module.getPid().toString())) {
                map = new HashMap<String, Object>();
                map.put("id", module.getId());
                map.put("pid", module.getPid());
                map.put("text", module.getText());
                map.put("url", module.getModuleurl());
                List<Map<String, Object>> transitionTreeGrid = transitionTreeGrid(list, module.getId());
                if (0 != transitionTreeGrid.size()) {
                    map.put("children", transitionTreeGrid);
                    map.put("state", "closed");
                }
                tree.add(map);
            }
        }
        System.out.println("这是tree"+tree);
        return tree;
    }

}
