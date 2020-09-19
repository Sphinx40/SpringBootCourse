package sphinx.demo.resources;

import org.springframework.web.bind.annotation.*;
import sphinx.demo.domain.Capability;
import sphinx.demo.services.CapabilityService;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin
public class CapabilityController {

    private CapabilityService capabilityService;

    public CapabilityController(CapabilityService capabilityService) {
        this.capabilityService = capabilityService;
    }


    @GetMapping("/{id}")
    public Capability getCapability(@PathVariable Long id) {
        Capability capability = capabilityService.findCapById(id);
        return capability;
    }
}
