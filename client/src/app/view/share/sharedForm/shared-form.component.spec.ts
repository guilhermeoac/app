import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { ExploreContainerComponentModule } from '../../../explore-container/explore-container.module';

import { SharedFormComponent } from './shared-form.component';

describe('Tab3Page', () => {
  let component: SharedFormComponent;
  let fixture: ComponentFixture<SharedFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [SharedFormComponent],
      imports: [IonicModule.forRoot(), ExploreContainerComponentModule]
    }).compileComponents();

    fixture = TestBed.createComponent(SharedFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
