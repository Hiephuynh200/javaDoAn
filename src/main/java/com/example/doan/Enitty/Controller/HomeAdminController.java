package com.example.doan.Enitty.Controller;

import com.example.doan.Enitty.Entity.SanPham;
import com.example.doan.Enitty.Services.LoaiSpServices;
import com.example.doan.Enitty.Services.SanPhamServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/admin")
public class HomeAdminController {
    @Autowired
    SanPhamServices sanPhamServices;

    @Autowired
    LoaiSpServices loaiSpServices;

//    @GetMapping("/index")
//    public String AdminHome() {
//        return "HomeAdmin/index";
//    }
//    @GetMapping("/index")
//    public String showSp(Model model) {
//        List<SanPham> sanphams = sanPhamServices.getAllSP();
//        model.addAttribute("sanphams", sanphams);
//        return "HomeAdmin/index";
//    }

//    @PostMapping("/add")
//    public String addBookForm(@Valid SanPham sanPham, Errors error, Model model) {
//        if (null != error && error.getErrorCount() > 0)  {
//            model.addAttribute("LoaiSp", loaiSpServices.getAllLoaiSP());
//            return "HomeAdmin/add";
//        } else {
//            sanPhamServices.addSp(sanPham);
//            return "redirect:/admin";
//        }
//    }
//    @GetMapping("/add")
//    public String addBook( SanPham sanPham, Model model) {
//        model.addAttribute("sanPham", new SanPham());
//        model.addAttribute("LoaiSp", loaiSpServices.getAllLoaiSP());
//        return "HomeAdmin/add";
//    }
//    @GetMapping("/edit/{id}")
//    public String editSp(@PathVariable("id") Long id, Model model) {
//        SanPham sanPham = sanPhamServices.getSpById(id);
//        if (sanPham != null) {
//            model.addAttribute("sanPham", sanPham);
//            model.addAttribute("categories", loaiSpServices.getAllLoaiSP());
//            return "Product/edit";
//        } else {
//            return "not-found";
//        }
//    }
//
//    @PostMapping("/edit")
//    public String editSp(@ModelAttribute("sanPham")SanPham sanPham) {
//        sanPhamServices.editSp(sanPham);
//        return "redirect:/admin";
//    }
}
