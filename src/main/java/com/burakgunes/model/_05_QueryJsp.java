package com.burakgunes.model;

import com.burakgunes.dto.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _05_QueryJsp {

    //localhost:8080/justquery
    //Sadece ekranda göster
    @GetMapping("/justquery")
    @ResponseBody
    public String getQuery() {

        return "Sadece ekranda yaz";
    }

    //Bir sayfaya yönlendir
    @GetMapping("/ikinciuygulama")
    public String secondMethod() {
        return "index";
    }

    //dizin içinde dizin redirect
    //localhost:8080/ucuncuuygulama
    @GetMapping("/ucuncuuygulama")
    public String thirdMethod() {
        return "otherfile/other";
    }

    //localhost:8080/dorduncuuygulama
    //@GetMapping ==> URL
    //return ==> gidilecek sayfa
    //Model<== Controller ==> View
    @GetMapping("/dorduncuuygulama")
    public String fourthMethod(Model model) {

        model.addAttribute("query_key", "Burak Gunes");
        return "_2_query";
    }

    //localhost:8080/besinciuygulama
    //Modele bu sefer birden fazla obje ekleyerek _2_query.jsp sayfasına göndeme işlemi
    @GetMapping("/besinciuygulama")
    public String fifthMethod(Model model) {
        AdminDto adminDto = AdminDto.builder().adminName("Burak").adminLastName("Gunes").build();
        model.addAttribute("query_admin", adminDto);
        model.addAttribute("query_key", "Tuana Sakarya");
        return "_2_query";
    }

    //localhost:8080/altinciuygulama
    //url yazacağım sayıya göre çalışmasını sağlıyoruz
    @GetMapping("/altinciuygulama/{param1}")
    public String sixthMethod(Model model, @PathVariable(name = "param1") int id427) {
        model.addAttribute("query_key", "Berserk Guts ID: " + id427);
        return "_2_query";
    }


    //locahost:8080/yedinciuygulama
    //param değerini Wrapper class veriyoruz. Çünkü null değeri alabiliyor olması gerekiyor.
    //Wrapper da serileştirme yapılabilir. Primitive türlerde bu mümkün değildir.
    @GetMapping({"/yedinciuygulama", "/yedinciuygulama/{param2}"})
    public String sixthMethod2(Model model, @PathVariable(name = "param2",required = false) Long id427) {

        if(id427!=null) {
            model.addAttribute("query_key", "Tutişko ID: " + id427);
        } else {
            model.addAttribute("query_key", "Data YOK ID: ");
        }
        return "_2_query";
    }

}
