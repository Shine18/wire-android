/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.controllers.onboarding;


import com.waz.annotations.Controller;
import com.waz.api.IConversation;
import com.waz.zclient.controllers.navigation.Page;
import com.waz.zclient.pages.main.onboarding.OnBoardingHintType;

@Controller
public interface IOnboardingController {

    void tearDown();

    void incrementPeoplePickerShowCount();

    void incrementSwipeToConversationListCount(Page currentRightPage);

    void incrementParticipantsShowCount();

    OnBoardingHintType getCurrentOnBoardingHint(Page currentPage, IConversation currentConversation, boolean conversationHasDraft);

    void addOnboardingControllerObserver(OnboardingControllerObserver onboardingControllerObserver);

    void removeOnboardingControllerObserver(OnboardingControllerObserver onboardingControllerObserver);

    void hideOnboardingHint(OnBoardingHintType requestedType);

    OnBoardingHintType getCurrentVisibleHintType();

    void setCurrentHintType(OnBoardingHintType hintType);

    boolean shouldShowConversationListHint();

    void hideConversationListHint();

}
