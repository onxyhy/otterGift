package otter.sherry.ottergift.cs;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cs")
@RequiredArgsConstructor

public class CSController {
    private final CSService csService;

    @PostMapping("/{id}")
    public void csRegister(@PathVariable("id") Long id,
                           @RequestBody CSEntity csEntity) {
        csService.CSRegister(id, csEntity);
    }

    //문의 1개 조회
    @GetMapping("/{id}")
    public CSEntity getInquiryById(@PathVariable("id") Long serviceId) {
        return csService.findById(serviceId)
                .orElseThrow(() -> new IllegalArgumentException("Inquiry not found with id: " + serviceId));
    }

    //문의 전부 조회
    @GetMapping
    public List<CSEntity> getAllInquiries() {
        return csService.getAllInquiries();
    }
}
