package otter.sherry.ottergift.cs;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
    @Operation(summary = "문의조회",description = "문의 하나를 조회합니다.")
    public CSEntity getInquiryById(
            @Parameter(required = true, description = "문의 하나를 조회합니다.")
            @PathVariable("id") Long serviceId) {
        return csService.findById(serviceId)
                .orElseThrow(() -> new IllegalArgumentException("Inquiry not found with id: " + serviceId));
    }

    //문의 전부 조회
    @Operation(summary = "문의 전체 조회",description = "문의 전체를 조회합니다.")
    @GetMapping
    public List<CSEntity> getAllInquiries() {
        return csService.getAllInquiries();
    }
}
