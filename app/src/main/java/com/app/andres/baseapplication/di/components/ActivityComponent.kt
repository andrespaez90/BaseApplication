package com.app.andres.baseapplication.di.components

import com.app.andres.baseapplication.di.scope.ActivityScope

import dagger.Component

@ActivityScope
@Component(dependencies = [(AppComponent::class)])
interface ActivityComponent : AppComponent
