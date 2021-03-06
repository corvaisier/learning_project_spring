package com.julien.sportapi.service;

import com.julien.sportapi.dao.Coach.CoachDao;
import com.julien.sportapi.domain.Coach;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class CoachServiceTest {
    CoachDao mockedDao;
    CoachService mockedService;

    @Before
    public void setUp() {
        mockedDao = mock(CoachDao.class);
        mockedService = new CoachService(mockedDao);
    }

    @Test
    public void add() {
        mockedService.add("Toto");

        ArgumentCaptor<Coach> coachArgumentCaptor = ArgumentCaptor.forClass(Coach.class);
        verify(mockedDao).add(coachArgumentCaptor.capture());

        Coach coachSentToDAO = coachArgumentCaptor.getValue();
        assertThat(coachSentToDAO.getCoach_ID(), is(notNullValue()));
        assertThat(coachSentToDAO.getCoach_Name(), is("Toto"));
    }

    @Test
    public void delete() {
    }

    @Test
    public void findAll() {
        List<Coach> expectedCoach = Arrays.asList(
                new Coach(UUID.randomUUID(), "Super coach"),
                new Coach(UUID.randomUUID(), "Super tout court")
        );

        when(mockedDao.findAll()).thenReturn(expectedCoach);

        List<Coach> actualBooks = mockedService.findAll();
        assertThat(actualBooks, equalTo(expectedCoach));
    }

    @Test
    public void findByName() {
        List<Coach> expectedCoach = Arrays.asList(
                new Coach(UUID.randomUUID(), "Super coach"),
                new Coach(UUID.randomUUID(), "Super tout court")
        );

        when(mockedDao.findByName("Super coach")).thenReturn(expectedCoach
                .stream().filter(coach -> coach.getCoach_Name()
                        .equals("Super coach")).findFirst());

        Optional<Coach> actualBooks = mockedService.findByName("Super coach");
        assertThat(actualBooks, equalTo(expectedCoach));
    }
}