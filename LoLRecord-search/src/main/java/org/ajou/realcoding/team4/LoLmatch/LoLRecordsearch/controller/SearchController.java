package org.ajou.realcoding.team4.LoLmatch.LoLRecordsearch.controller;

import org.ajou.realcoding.team4.LoLmatch.LoLRecordsearch.domain.LeagueEntry;
import org.ajou.realcoding.team4.LoLmatch.LoLRecordsearch.domain.Summoner;
import org.ajou.realcoding.team4.LoLmatch.LoLRecordsearch.service.LeagueApiService;
import org.ajou.realcoding.team4.LoLmatch.LoLRecordsearch.service.SummonerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SummonerApiService summonerApiService;

    @Autowired
    private LeagueApiService leagueApiService;

    @GetMapping("/summonerApi-service/summoners")
    public Summoner getSummoner(@RequestParam String SummonerId, @RequestParam String apiKey) {
        return summonerApiService.getSummoner(SummonerId, apiKey);
    }

    @GetMapping("/leagueApi-service/leagues")
    public LeagueEntry getLeagueEntry(@RequestParam String encryptedSummonerId, @RequestParam String apiKey) {
        return leagueApiService.getLeagueEntry(encryptedSummonerId, apiKey);
    }
}