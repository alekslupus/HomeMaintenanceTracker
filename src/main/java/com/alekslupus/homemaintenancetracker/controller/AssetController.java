package com.alekslupus.homemaintenancetracker.controller;

import com.alekslupus.homemaintenancetracker.api.DefaultApi;
import com.alekslupus.homemaintenancetracker.api.dto.AssetDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class AssetController implements DefaultApi {

    @Override
    public ResponseEntity<List<AssetDto>> assetsGet() {
        AssetDto assetDto = new AssetDto(UUID.randomUUID(), "erty");
        List<AssetDto> list = new ArrayList<>();
        list.add(assetDto);
        return ResponseEntity.ok(list);
    }

    @Override
    public ResponseEntity<AssetDto> assetsPost(AssetDto assetDto) {
        // Логика создания объекта
        return ResponseEntity.status(HttpStatus.CREATED).body(assetDto);
    }

    // Аналогично для других эндпоинтов
}
